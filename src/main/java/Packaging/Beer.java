package Packaging;


import Packaging.values.BeerID;
import Packaging.values.BeerName;
import Packaging.values.BeerQuantity;
import Packaging.values.BeerSize;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Beer extends Entity<BeerID> {
    private BeerName beerName;
    private BeerQuantity beerQuantity;
    private BeerSize beerSize;

    public Beer(BeerID entityId, BeerName beerName, BeerQuantity beerQuantity, BeerSize beerSize) {
        super(entityId);
        this.beerName = beerName;
        this.beerQuantity = beerQuantity;
        this.beerSize = beerSize;
    }

    public void ChangeName(BeerName beerName){
        this.beerName = Objects.requireNonNull(beerName);
    }

    public void ChangeQuantity(BeerQuantity beerQuantity){
        this.beerQuantity = Objects.requireNonNull(beerQuantity);
    }

    public void ChangeSize(BeerSize beerSize){
        this.beerSize = Objects.requireNonNull(beerSize);
    }


    public BeerName beerName() {
        return beerName;
    }

    public BeerQuantity beerQuantity() {
        return beerQuantity;
    }

    public BeerSize beerSize() {
        return beerSize;
    }
}
