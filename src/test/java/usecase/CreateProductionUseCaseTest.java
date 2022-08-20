package usecase;

import Production.commands.CreateProduction;
import Production.events.ProductionCreated;
import Production.generics.FactoryName;
import Production.values.ProductionID;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateProductionUseCaseTest {

    @Test
    public void CreateProductionUseCaseTest(){
        CreateProduction command = new CreateProduction(new ProductionID(), new FactoryName("Aguila"));
        CreateProductionUseCase useCase = new CreateProductionUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong creating Production"))
                .getDomainEvents();

        ProductionCreated event = (ProductionCreated) events.get(0);

        Assertions.assertEquals(command.getFactoryName().value(), event.getFactoryName().value());
    }
}