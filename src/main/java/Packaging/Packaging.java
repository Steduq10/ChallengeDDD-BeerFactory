package Packaging;


import Packaging.events.*;
import Packaging.values.*;
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

public class Packaging extends AggregateEvent<PackagingID> {

    protected FactoryName factoryName;

    protected ProductionID productionID;
    protected Set<Beer> beers;
    protected Set<Packer> packers;

    public Packaging(PackagingID entityId, FactoryName factoryName, ProductionID productionID) {
        super(entityId);
        appendChange(new PackagingCreated(factoryName, productionID)).apply();
    }

    public Packaging(PackagingID packagingID){
        super(packagingID);
        subscribe(new PackagingChanged(this));
    }
    public static Packaging from(PackagingID packagingID, List<DomainEvent> events){
        var packaging = new Packaging(packagingID);
        events.forEach(packaging::applyEvent);
        return packaging;
    }

    public void notifyPackers(String message){
        Objects.requireNonNull(message);
        appendChange(new NotificationSent(message)).apply();
    }
    public void updateFactoryName(FactoryName factoryName){
        Objects.requireNonNull(factoryName);
        appendChange(new FactoryNameUpdated(factoryName)).apply();
    }

    public void addBeer(BeerID entityID, BeerName beerName, BeerQuantity beerQuantity, BeerSize beerSize){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(beerName);
        Objects.requireNonNull(beerQuantity);
        Objects.requireNonNull(beerSize);
        appendChange(new BeerAdded(entityID,beerName,beerQuantity,beerSize));
    }

    public void addPacker(PackerID entityID, PackerName packerName, PackerDNI packerDNI, PackerUniform packerUniform, PackerHoursWorked packerHoursWorked){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(packerName);
        Objects.requireNonNull(packerDNI);
        Objects.requireNonNull(packerUniform);
        Objects.requireNonNull(packerHoursWorked);
        appendChange(new PackerAdded(entityID,packerName,packerDNI,packerUniform, packerHoursWorked));
    }


    public void updatePackerHoursWorked(PackerID entityID, PackerHoursWorked packerHoursWorked){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(packerHoursWorked);
        appendChange(new PackerHoursWorkedUpdated(entityID,packerHoursWorked));
    }

    public void updatePackerUniform(PackerID entityID, PackerUniform packerUniform){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(packerUniform);
        appendChange(new PackerUniformUpdated(entityID, packerUniform));
    }


    public void updateBeerQuantity(BeerID entityID, BeerQuantity beerQuantity){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(beerQuantity);
        appendChange(new BeerQuantityChanged(entityID,beerQuantity));
    }

    public void updateBeerSize(BeerID entityID, BeerSize beerSize){
        Objects.requireNonNull(entityID);
        Objects.requireNonNull(beerSize);
        appendChange(new BeerSizeChanged(entityID, beerSize));
    }

    public Optional<Beer> getBeerById(BeerID beerID){
        return beers().stream().filter((beer -> beer.identity().equals(beerID))).findFirst();
    }

    public Optional<Packer> getProductionEmployeeById(PackerID packerID){
        return packers.stream().filter((productionEmployee -> productionEmployee.identity().equals(packerID))).findFirst();
    }

    public FactoryName factoryName(){
        return  factoryName;
    }

    public Set<Beer> beers(){
        return beers;
    }

    public Set<Packer> packers(){
        return packers;
    }


}
