package usecase;

import Packaging.events.PackagingCreated;
import Production.values.ProductionID;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import Production.generics.FactoryName;
import Production.generics.event.NotificationSent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class NotifyPackersUseCaseTest {
    private final String ROOTID = "145tr67";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void NotifyPackers(){
        PackagingCreated event = new PackagingCreated(new FactoryName("Bavaria"),new ProductionID());
        event.setAggregateRootId(ROOTID);
        var useCase = new NotifyPackersUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(event));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong notifying packers"))
                .getDomainEvents();

        NotificationSent responseEvent = (NotificationSent) events.get(0);

        Assertions.assertEquals(responseEvent.getMessage(), "Packers, we have finished the production, be ready to start packing the beers");
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}