package usecase;

import Packaging.commands.AddPacker;
import Packaging.events.PackagingCreated;
import Packaging.events.PackerAdded;
import Packaging.values.*;
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
class addPackerUseCaseTest {

    private final String ROOTID = "145tr67";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addPackerUseCaseTest(){
        var command = new AddPacker(PackagingID.of(ROOTID), PackerID.of("23er45"), new PackerName("Paula Rodriguez"),new PackerDNI("497426985"), new PackerUniform("yellow with security"));
        var useCase = new addPackerUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new PackagingCreated(
                        new FactoryName("Bavaria"),
                        new ProductionID()
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong adding packers"))
                .getDomainEvents();

        PackerAdded event = (PackerAdded) events.get(0);

        Assertions.assertEquals(command.getPackerName().value(), event.getPackerName().value());
        Assertions.assertEquals(command.getPackerDNI().value(), event.getPackerDNI().value());
        Assertions.assertEquals(command.getPackerUniform().value(), event.getPackerUniform().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}