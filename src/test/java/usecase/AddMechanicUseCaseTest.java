package usecase;

import Maintenance.commands.AddMechanic;
import Maintenance.events.MaintenanceCreated;
import Maintenance.events.MechanicAdded;
import Maintenance.values.*;
import Production.values.ProductionID;
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
class AddMechanicUseCaseTest {

    private final String ROOTID = "145tr67";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addMechanicUseCaseTest(){
        var command = new AddMechanic(MaintenainceID.of(ROOTID), MechanicID.of("23er45"), new MechanicName("Nelson Jimenez"),new MechanicDNI("71325674"), new MechanicUniform("white with security"), new MechanicHoursWorked("10"));
        var useCase = new AddMechanicUseCase();

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
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong adding mechanics"))
                .getDomainEvents();

        MechanicAdded event = (MechanicAdded) events.get(0);

        Assertions.assertEquals(command.getMechanicName().value(), event.getMechanicName().value());
        Assertions.assertEquals(command.getMechanicDNI().value(), event.getMechanicDNI().value());
        Assertions.assertEquals(command.getMechanicUniform().value(), event.getMechanicUniform().value());
        Assertions.assertEquals(command.getMechanicHoursWorked().value(), event.getMechanicHoursWorked().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}