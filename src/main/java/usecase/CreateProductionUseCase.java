package usecase;

import Production.Production;
import Production.commands.CreateProduction;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateProductionUseCase extends UseCase<RequestCommand<CreateProduction>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateProduction> createProductionRequestCommand) {
        var command = createProductionRequestCommand.getCommand();
        var production = new Production(
                command.getProductionID(),
                command.getFactoryName()
        );

        emit().onResponse(new ResponseEvents(production.getUncommittedChanges()));
    }
}
