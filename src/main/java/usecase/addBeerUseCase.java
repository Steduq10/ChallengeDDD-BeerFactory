package usecase;

import Packaging.Packaging;
import Packaging.commands.AddBeer;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class addBeerUseCase extends UseCase<RequestCommand<AddBeer>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddBeer> addBeerRequestCommand) {
        var command = addBeerRequestCommand.getCommand();
        var packaging = Packaging.from(command.getPackagingID(), retrieveEvents(command.getPackagingID().value()));
        packaging.addBeer(
                command.getBeerID(),
                command.getBeerName(),
                command.getBeerQuantity(),
                command.getBeerSize()
        );

        emit().onResponse(new ResponseEvents(packaging.getUncommittedChanges()));
    }
}
