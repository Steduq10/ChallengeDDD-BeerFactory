package usecase;

import Production.Production;
import Production.commands.UpdateEmployeUniform;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class updateEmployeeUniformUseCase extends UseCase<RequestCommand<UpdateEmployeUniform>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateEmployeUniform> updateEmployeUniformRequestCommand) {
        var command = updateEmployeUniformRequestCommand.getCommand();
        var production = Production.from(command.getProductionID(), retrieveEvents(command.getProductionID().value()));
        production.updateEmployeeUniform(command.getProductionEmployeID(),command.getProductionEmployeUniform());

        emit().onResponse(new ResponseEvents(production.getUncommittedChanges()));
    }
}
