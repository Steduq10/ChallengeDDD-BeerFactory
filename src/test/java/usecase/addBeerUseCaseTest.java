package usecase;

import Packaging.commands.AddBeer;
import Packaging.events.BeerAdded;
import Packaging.events.PackagingCreated;
import Packaging.values.*;
import generics.FactoryName;
import Production.values.ProductionID;
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
class addBeerUseCaseTest {

    private final String ROOTID = "54321";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addBeerUseCaseTest(){
        //AddBeer command = new AddBeer(new PackagingID(), new BeerID(), new BeerName("Club Colombia Dorada"), new BeerQuantity("1500"),new BeerSize("300 ml"));
        var command = new AddBeer(PackagingID.of(ROOTID), BeerID.of("12345"), new BeerName("Club Colombia Dorada"),new BeerQuantity("1500"), new BeerSize("300 ml"));
        var useCase = new addBeerUseCase();

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
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong adding Beers"))
                .getDomainEvents();

        BeerAdded event = (BeerAdded) events.get(0);

        Assertions.assertEquals(command.getBeerName().value(), event.getBeerName().value());
        Assertions.assertEquals(command.getBeerQuantity().value(), event.getBeerQuantity().value());
        Assertions.assertEquals(command.getBeerSize().value(), event.getBeerSize().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }

}