package Packaging.events;

import Packaging.values.BeerID;
import Packaging.values.BeerName;
import co.com.sofka.domain.generic.DomainEvent;

public class BeerNameChanged extends DomainEvent {


    private final BeerID beerID;
    private final BeerName beerName;


    public BeerNameChanged( BeerID beerID, BeerName beerName) {
        super("DDD.Packaging.BeerNameChanged");
        this.beerID = beerID;
        this.beerName = beerName;

    }

    public BeerID getBeerID() {
        return beerID;
    }

    public BeerName getBeerName() {
        return beerName;
    }


}
