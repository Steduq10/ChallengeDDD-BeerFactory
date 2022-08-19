package Packaging.events;

import Packaging.values.BeerID;
import Packaging.values.BeerName;
import Packaging.values.BeerQuantity;
import Packaging.values.BeerSize;
import co.com.sofka.domain.generic.DomainEvent;

public class BeerSizeChanged extends DomainEvent {

    private final BeerID beerID;
    private final BeerSize beerSize;

    public BeerSizeChanged( BeerID beerID, BeerSize beerSize) {
        super("DDD.Packaging.BeerSizeChanged");
        this.beerID = beerID;
        this.beerSize = beerSize;
    }

    public BeerID getBeerID() {
        return beerID;
    }


    public BeerSize getBeerSize() {
        return beerSize;
    }
}
