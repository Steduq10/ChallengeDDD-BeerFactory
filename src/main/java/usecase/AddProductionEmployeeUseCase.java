package usecase;

import Production.Production;
import Production.commands.AddProductionEmploye;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AddProductionEmployeeUseCase extends UseCase<RequestCommand<AddProductionEmploye>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddProductionEmploye> addProductionEmployeRequestCommand) {
        var command = addProductionEmployeRequestCommand.getCommand();
        var production = Production.from(command.getProductionID(), retrieveEvents(command.getProductionID().value()));
        production.addProductionEmployee(
                command.getProductionEmployeID(),
                command.getProductionEmployeName(),
                command.getProductionEmployeDNI(),
                command.getProductionEmployeUniform()
        );
        emit().onResponse(new ResponseEvents(production.getUncommittedChanges()));
    }
}
