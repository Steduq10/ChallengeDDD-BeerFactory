package usecase;

import Maintenance.Maintenance;
import Maintenance.commands.CreateMaintenance;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateMaintenanceUseCase extends UseCase<RequestCommand<CreateMaintenance>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateMaintenance> createMaintenanceRequestCommand) {
        var command = createMaintenanceRequestCommand.getCommand();
        var maintenance = new Maintenance(
                command.getMaintenainceID(),
                command.getFactoryName(),
                command.getProductionID()
        );
        emit().onResponse(new ResponseEvents(maintenance.getUncommittedChanges()));
    }
}
