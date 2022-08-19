package Packaging.events;

import Packaging.values.BeerID;
import Packaging.values.BeerName;
import Packaging.values.BeerQuantity;
import Packaging.values.BeerSize;
import co.com.sofka.domain.generic.DomainEvent;

public class BeerQuantityChanged extends DomainEvent {

    private final BeerID beerID;
    private final BeerQuantity beerQuantity;


    public BeerQuantityChanged( BeerID beerID, BeerQuantity beerQuantity) {
        super("DDD.Packaging.BeerQuantityChanged");
        this.beerID = beerID;
        this.beerQuantity = beerQuantity;
    }

    public BeerID getBeerID() {
        return beerID;
    }


    public BeerQuantity getBeerQuantity() {
        return beerQuantity;
    }


}
