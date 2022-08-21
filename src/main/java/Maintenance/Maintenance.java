package Maintenance;

import Maintenance.events.*;
import Maintenance.values.*;
import generics.FactoryName;
import generics.events.FactoryNameUpdated;
import Production.values.ProductionID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import generics.events.NotificationSent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Maintenance extends AggregateEvent<MaintenainceID> {
    protected FactoryName factoryName;

    protected ProductionID productionID;
    protected Set<Tool> tools;
    protected Set<Mechanic> mechanics;

    public Maintenance(MaintenainceID entityId, FactoryName factoryName, ProductionID productionID) {
        super(entityId);
        appendChange(new MaintenanceCreated(factoryName, productionID)).apply();
    }

    public Maintenance(MaintenainceID maintenainceID){
        super(maintenainceID);
        subscribe(new MaintenanceChanged(this));
    }
    public static Maintenance from(MaintenainceID maintenainceID, List<DomainEvent> events){
        var maintenance = new Maintenance(maintenainceID);
        events.forEach(maintenance::applyEvent);
        return maintenance;
    }

    public void notifyMechanics(String message){
        Objects.requireNonNull(message);
        appendChange(new NotificationSent(message)).apply();
    }

    public void updateFactoryName(FactoryName factoryName){
        Objects.requireNonNull(factoryName);
        appendChange(new FactoryNameUpdated(factoryName)).apply();
    }

    public void addMechanic(MechanicID entityID, MechanicName mechanicName, MechanicDNI mechanicDNI, MechanicUniform mechanicUniform, MechanicHoursWorked mechanicHoursWorked){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(mechanicName);
        Objects.requireNonNull(mechanicDNI);
        Objects.requireNonNull(mechanicUniform);
        Objects.requireNonNull(mechanicHoursWorked);
        appendChange(new MechanicAdded(entityID,mechanicName,mechanicDNI,mechanicUniform, mechanicHoursWorked));
    }

    public void addTool(ToolID entityID, ToolName toolName, ToolQuantity toolQuantity, ToolBrand toolBrand){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(toolName);
        Objects.requireNonNull(toolQuantity);
        Objects.requireNonNull(toolBrand);
        appendChange(new ToolAdded(entityID,toolName,toolQuantity,toolBrand));
    }



    public void updateMechanicHoursWorked(MechanicID entityID, MechanicHoursWorked mechanicHoursWorked){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(mechanicHoursWorked);;
        appendChange(new MechanicHoursWorkedUpdated(entityID,mechanicHoursWorked));
    }

    public void updateMechanicUniform(MechanicID entityID, MechanicUniform mechanicUniform){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(mechanicUniform);
        appendChange(new MechanicUniformUpdated(entityID,mechanicUniform));
    }



    public void changeToolQuantity(ToolID entityID, ToolQuantity toolQuantity){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(toolQuantity);
        appendChange(new ToolQuantityChanged(entityID,toolQuantity));
    }

    public void changeToolBrand(ToolID entityID, ToolBrand toolBrand){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(toolBrand);
        appendChange(new ToolBrandChanged(entityID,toolBrand));
    }

    public Optional<Tool> getToolById(ToolID toolID){
        return tools.stream().filter((commodity -> commodity.identity().equals(toolID))).findFirst();
    }

    public Optional<Mechanic> getProductionEmployeeById(MechanicID mechanicID){
        return mechanics.stream().filter((productionEmployee -> productionEmployee.identity().equals(mechanicID))).findFirst();
    }

    public FactoryName factoryName(){
        return  factoryName;
    }

    public Set<Tool> tools(){
        return tools;
    }

    public Set<Mechanic> mechanics(){
        return mechanics;
    }

}
