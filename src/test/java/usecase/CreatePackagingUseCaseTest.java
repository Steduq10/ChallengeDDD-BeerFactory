package usecase;

import Maintenance.commands.CreateMaintenance;
import Maintenance.events.MaintenanceCreated;
import Maintenance.values.MaintenainceID;
import Packaging.commands.CreatePackaging;
import Packaging.events.PackagingCreated;
import Packaging.values.PackagingID;
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
class CreatePackagingUseCaseTest {

    @Test
    public void CreateProductionUseCaseTest(){
        CreatePackaging command = new CreatePackaging(new PackagingID(),new FactoryName("Aguila"),new ProductionID());
        CreatePackagingUseCase useCase = new CreatePackagingUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong creating Packaging"))
                .getDomainEvents();

        PackagingCreated event = (PackagingCreated) events.get(0);

        Assertions.assertEquals(command.getFactoryName().value(), event.getFactoryName().value());
    }
}