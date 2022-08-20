package usecase;


import Packaging.Packaging;
import Packaging.commands.CreatePackaging;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreatePackagingUseCase extends UseCase<RequestCommand<CreatePackaging>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreatePackaging> createPackagingRequestCommand) {
        var command = createPackagingRequestCommand.getCommand();
        var packaging = new Packaging(
                command.getPackagingID(),
                command.getFactoryName(),
                command.getProductionID()
        );

        emit().onResponse(new ResponseEvents(packaging.getUncommittedChanges()));
    }
}
