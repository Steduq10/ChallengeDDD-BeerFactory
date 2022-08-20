package Maintenance;

import Maintenance.events.*;

import generics.event.FactoryNameUpdated;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class MaintenanceChanged extends EventChange {

    public  MaintenanceChanged(Maintenance maintenance) {
        apply((MaintenanceCreated event) -> {
            maintenance.factoryName = event.getFactoryName();
            maintenance.tools = new HashSet<>();
            maintenance.mechanics = new HashSet<>();
        });

        apply((ToolAdded event)->{
            maintenance.tools.add(new Tool(
                    event.getToolID(),
                    event.getToolName(),
                    event.getToolQuantity(),
                    event.getToolBrand()
            ));
        });

        apply((FactoryNameUpdated event)->{
            maintenance.factoryName = event.getFactoryName();
        });

        apply((ToolNameChanged event)->{
            var tool = maintenance.getToolById(event.getToolID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the tool"));
            tool.ChangeName(event.getToolName());
        });

        apply((ToolQuantityChanged event)->{
            var tool = maintenance.getToolById(event.getToolID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the tool"));
            tool.ChangeQuantity(event.getToolQuantity());
        });

        apply((ToolBrandChanged event)->{
            var tool = maintenance.getToolById(event.getToolID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the tool"));
            tool.ChangeBrand(event.getToolBrand());
        });

        apply((MechanicAdded event)->{
            var numberOfMechanics = maintenance.mechanics().size();
            if (numberOfMechanics == 20){
                throw new IllegalArgumentException("Maximum amount of mechanics reached, you can't add more");
            }
            maintenance.mechanics.add(new Mechanic(
                    event.getMechanicID(),
                    event.getMechanicName(),
                    event.getMechanicDNI(),
                    event.getMechanicUniform()
            ));
        });

        apply((MechanicDNIUpdated event)->{
            var mechanic = maintenance.getProductionEmployeeById(event.getMechanicID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the mechanic"));
            mechanic.UpdateDNI(event.getMechanicDNI());
        });

        apply((MechanicNameUpdated event)->{
            var mechanic = maintenance.getProductionEmployeeById(event.getMechanicID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the mechanic"));
            mechanic.UpdateName(event.getMechanicName());
        });

        apply((MechanicUniformUpdated event)->{
            var mechanic = maintenance.getProductionEmployeeById(event.getMechanicID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the mechanic"));
            mechanic.UpdateUniform(event.getMechanicUniform());
        });



    }
}
