package usecase;

import Maintenance.commands.AddTool;
import Maintenance.events.MaintenanceCreated;
import Maintenance.events.ToolAdded;
import Maintenance.values.*;
import Production.values.ProductionID;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import generics.FactoryName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class addToolUseCaseTest {
    private final String ROOTID = "54321";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addToolUseCaseTest(){
        var command = new AddTool(MaintenainceID.of(ROOTID), ToolID.of("12345"), new ToolName("calibrator"),new ToolQuantity("5"), new ToolBrand("CATERPILLAR"));
        var useCase = new addToolUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new MaintenanceCreated(
                        new FactoryName("Bavaria"),
                        new ProductionID()
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong adding tools"))
                .getDomainEvents();

        ToolAdded event = (ToolAdded) events.get(0);

        Assertions.assertEquals(command.getToolName().value(), event.getToolName().value());
        Assertions.assertEquals(command.getToolQuantity().value(), event.getToolQuantity().value());
        Assertions.assertEquals(command.getToolBrand().value(), event.getToolBrand().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }

}