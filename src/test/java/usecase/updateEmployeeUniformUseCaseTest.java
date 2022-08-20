package usecase;

import Production.commands.UpdateEmployeUniform;
import Production.events.EmployUniformUpdated;
import Production.events.ProductionCreated;
import Production.events.ProductionEmployeAdded;
import Production.generics.FactoryName;
import Production.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class updateEmployeeUniformUseCaseTest {

    private final String ROOTID = "145tr67";

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateEmployeeUniform(){
        var command = new UpdateEmployeUniform(ProductionID.of(ROOTID), ProductionEmployeID.of("23er45"), new ProductionEmployeUniform("Green Security uniform"));
        var useCase = new updateEmployeeUniformUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new ProductionCreated(
                        new FactoryName("Aguila")
                ),
                new ProductionEmployeAdded(ProductionEmployeID.of("23er45"),
                        new ProductionEmployeName("Pablo"),
                        new ProductionEmployeDNI("4274569514"),
                        new ProductionEmployeUniform("White uniform without security"))
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong updating uniform to the Employee"))
                .getDomainEvents();

        var event = (EmployUniformUpdated)events.get(0);
        //Assertions.assertEquals("Green Security uniform", event.getProductionEmployeUniform().value());
        Assertions.assertEquals(command.getProductionEmployeUniform().value(), event.getProductionEmployeUniform().value());
        Mockito.verify(repository).getEventsBy(ROOTID);

    }

}