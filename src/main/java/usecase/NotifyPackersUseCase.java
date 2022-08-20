package usecase;

import Maintenance.Maintenance;
import Maintenance.events.MaintenanceCreated;
import Maintenance.values.MaintenainceID;
import Packaging.Packaging;
import Packaging.events.PackagingCreated;
import Packaging.values.PackagingID;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

public class NotifyPackersUseCase extends UseCase<TriggeredEvent<PackagingCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<PackagingCreated> packagingCreatedTriggeredEvent) {
        var event = packagingCreatedTriggeredEvent.getDomainEvent();
        var packaging = Packaging.from(PackagingID.of(event.aggregateRootId()), this.retrieveEvents());
        packaging.notifyPackers("Packers, we have finished the production, be ready to start packing the beers");

        emit().onResponse(new ResponseEvents(packaging.getUncommittedChanges()));
    }
}
