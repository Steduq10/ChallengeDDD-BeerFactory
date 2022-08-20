package usecase;

import Maintenance.Maintenance;
import Maintenance.events.MaintenanceCreated;
import Maintenance.values.MaintenainceID;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

public class NotifyMechanicsUseCase extends UseCase<TriggeredEvent<MaintenanceCreated>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<MaintenanceCreated> maintenanceCreatedTriggeredEvent) {
        var event = maintenanceCreatedTriggeredEvent.getDomainEvent();
        var maintenance = Maintenance.from(MaintenainceID.of(event.aggregateRootId()), this.retrieveEvents());
        maintenance.notifyMechanics("Mechanics, we have finished the production, we need maintenance in our equipment");

        emit().onResponse(new ResponseEvents(maintenance.getUncommittedChanges()));
    }
}
