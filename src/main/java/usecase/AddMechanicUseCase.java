package usecase;

import Maintenance.Maintenance;
import Maintenance.commands.AddMechanic;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AddMechanicUseCase extends UseCase<RequestCommand<AddMechanic>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddMechanic> addMechanicRequestCommand) {
        var command = addMechanicRequestCommand.getCommand();
        var maintenance = Maintenance.from(command.getMaintenainceID(), retrieveEvents(command.getMaintenainceID().value()));
        maintenance.addMechanic(
                command.getMechanicID(),
                command.getMechanicName(),
                command.getMechanicDNI(),
                command.getMechanicUniform()
        );

        emit().onResponse(new ResponseEvents(maintenance.getUncommittedChanges()));
    }
}
