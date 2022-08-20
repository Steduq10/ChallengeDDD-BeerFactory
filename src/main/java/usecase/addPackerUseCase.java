package usecase;

import Packaging.Packaging;
import Packaging.commands.AddPacker;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class addPackerUseCase extends UseCase<RequestCommand<AddPacker>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddPacker> addPackerRequestCommand) {
        var command = addPackerRequestCommand.getCommand();
        var packaging = Packaging.from(command.getPackagingID(), retrieveEvents(command.getPackagingID().value()));
        packaging.addPacker(
                command.getPackerID(),
                command.getPackerName(),
                command.getPackerDNI(),
                command.getPackerUniform()
        );

        emit().onResponse(new ResponseEvents(packaging.getUncommittedChanges()));
    }
}
