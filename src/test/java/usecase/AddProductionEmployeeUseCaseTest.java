package usecase;

import Production.commands.AddProductionEmploye;
import Production.events.ProductionCreated;
import Production.events.ProductionEmployeAdded;
import Production.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import Production.generics.FactoryName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AddProductionEmployeeUseCaseTest {
    private final String ROOTID = "145tr67";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addProductionEmployeeUseCaseTest(){
        var command = new AddProductionEmploye(ProductionID.of(ROOTID), ProductionEmployeID.of("23er45"), new ProductionEmployeName("Cristina Suarez"),new ProductionEmployeDNI("494569547"), new ProductionEmployeUniform("blue with security"), new ProductionEmployeHoursWorked("8"));
        var useCase = new AddProductionEmployeeUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new ProductionCreated(
                        new FactoryName("Bavaria")

                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong adding production employees"))
                .getDomainEvents();

        ProductionEmployeAdded event = (ProductionEmployeAdded) events.get(0);

        Assertions.assertEquals(command.getProductionEmployeName().value(), event.getProductionEmployeName().value());
        Assertions.assertEquals(command.getProductionEmployeDNI().value(), event.getProductionEmployeDNI().value());
        Assertions.assertEquals(command.getProductionEmployeUniform().value(), event.getProductionEmployeUniform().value());
        Assertions.assertEquals(command.getProductionEmployeHoursWorked().value(), event.getProductionEmployeHoursWorked().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}