package Packaging;

import Packaging.events.*;
import generics.events.FactoryNameUpdated;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PackagingChanged extends EventChange {

    public  PackagingChanged(Packaging packaging) {
        apply((PackagingCreated event) -> {
            packaging.factoryName = event.getFactoryName();
            packaging.beers = new HashSet<>();
            packaging.packers = new HashSet<>();
        });

        apply((BeerAdded event) -> {
            packaging.beers.add(new Beer(
                    event.getBeerID(),
                    event.getBeerName(),
                    event.getBeerQuantity(),
                    event.getBeerSize()
            ));
        });

        apply((FactoryNameUpdated event)->{
            packaging.factoryName = event.getFactoryName();
        });


        apply((BeerQuantityChanged event)->{
            var tool = packaging.getBeerById(event.getBeerID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the beer"));
            tool.ChangeQuantity(event.getBeerQuantity());
        });

        apply((BeerSizeChanged event)->{
            var tool = packaging.getBeerById(event.getBeerID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the beer"));
            tool.ChangeSize(event.getBeerSize());
        });

        apply((PackerAdded event)->{
            var numberOfPackers = packaging.packers().size();
            if (numberOfPackers == 20){
                throw new IllegalArgumentException("Maximum amount of packers reached, you can't add more");
            }
            packaging.packers.add(new Packer(
                    event.getPackerID(),
                    event.getPackerName(),
                    event.getPackerDNI(),
                    event.getPackerUniform(),
                    event.getPackerHoursWorked()
            ));
        });

        apply((PackerHoursWorkedUpdated event)->{
            var packer = packaging.getProductionEmployeeById(event.getPackerID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the packer"));
            packer.UpdateHoursWorked(event.getPackerHoursWorked());
        });


        apply((PackerUniformUpdated event)->{
            var packer = packaging.getProductionEmployeeById(event.getPackerID()).orElseThrow(()-> new IllegalArgumentException("Invalid ID to reach the packer"));
            packer.UpdateUniform(event.getPackerUniform());
        });

    }
}
