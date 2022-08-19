package Packaging.events;

import Packaging.values.BeerID;
import Packaging.values.BeerName;
import Packaging.values.BeerQuantity;
import Packaging.values.BeerSize;
import co.com.sofka.domain.generic.DomainEvent;

public class BeerAdded extends DomainEvent {

    private final BeerID beerID;
    private final BeerName beerName;
    private final BeerQuantity beerQuantity;
    private final BeerSize beerSize;

    public BeerAdded( BeerID beerID, BeerName beerName, BeerQuantity beerQuantity, BeerSize beerSize) {
        super("DDD.Packaging.BeerAdded");
        this.beerID = beerID;
        this.beerName = beerName;
        this.beerQuantity = beerQuantity;
        this.beerSize = beerSize;
    }

    public BeerID getBeerID() {
        return beerID;
    }

    public BeerName getBeerName() {
        return beerName;
    }

    public BeerQuantity getBeerQuantity() {
        return beerQuantity;
    }

    public BeerSize getBeerSize() {
        return beerSize;
    }
}
