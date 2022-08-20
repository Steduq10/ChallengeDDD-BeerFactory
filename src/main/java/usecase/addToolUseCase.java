package usecase;

import Maintenance.Maintenance;
import Maintenance.commands.AddTool;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class addToolUseCase extends UseCase<RequestCommand<AddTool>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddTool> addToolRequestCommand) {
        var command = addToolRequestCommand.getCommand();
        var maintenance = Maintenance.from(command.getMaintenainceID(), retrieveEvents(command.getMaintenainceID().value()));
        maintenance.addTool(
                command.getToolID(),
                command.getToolName(),
                command.getToolQuantity(),
                command.getToolBrand()
        );

        emit().onResponse(new ResponseEvents(maintenance.getUncommittedChanges()));
    }
}
