package usecase;

import Production.Commodity;
import Production.Production;
import Production.commands.AddCommodity;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AddCommodityUseCase extends UseCase<RequestCommand<AddCommodity>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddCommodity> addCommodityRequestCommand) {
        var command = addCommodityRequestCommand.getCommand();
        var production = Production.from(command.getProductionID(), retrieveEvents(command.getProductionID().value()));
        production.addCommodity(
                command.getCommodityID(),
                command.getCommodityName(),
                command.getCommodityQuantity(),
                command.getCommodityPrice()
        );

        emit().onResponse(new ResponseEvents(production.getUncommittedChanges()));
    }
}
