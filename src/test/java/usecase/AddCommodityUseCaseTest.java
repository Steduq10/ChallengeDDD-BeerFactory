package usecase;

import Production.commands.AddCommodity;
import Production.events.CommodityAdded;
import Production.events.ProductionCreated;
import Production.values.*;
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
class AddCommodityUseCaseTest {

    private final String ROOTID = "54321";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addCommodityUseCaseTest(){
        var command = new AddCommodity(ProductionID.of(ROOTID), CommodityID.of("12345"), new CommodityName("barley"),new CommodityQuantity("800"), new CommodityPrice("1000"));
        var useCase = new AddCommodityUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new ProductionCreated(
                        new FactoryName("Bavaria")
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong adding Commodities"))
                .getDomainEvents();

        CommodityAdded event = (CommodityAdded) events.get(0);

        Assertions.assertEquals(command.getCommodityName().value(), event.getCommodityName().value());
        Assertions.assertEquals(command.getCommodityQuantity().value(), event.getCommodityQuantity().value());
        Assertions.assertEquals(command.getCommodityPrice().value(), event.getCommodityPrice().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }

}