package usecase;

import Maintenance.commands.CreateMaintenance;
import Maintenance.events.MaintenanceCreated;
import Maintenance.values.MaintenainceID;
import Production.commands.CreateProduction;
import Production.events.ProductionCreated;
import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CreateMaintenanceUseCaseTest {

    @Test
    public void CreateProductionUseCaseTest(){
        CreateMaintenance command = new CreateMaintenance(new MaintenainceID(),new FactoryName("Aguila"),new ProductionID());
        CreateMaintenanceUseCase useCase = new CreateMaintenanceUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong creating Maintenance"))
                .getDomainEvents();

        MaintenanceCreated event = (MaintenanceCreated) events.get(0);

        Assertions.assertEquals(command.getFactoryName().value(), event.getFactoryName().value());
    }

}