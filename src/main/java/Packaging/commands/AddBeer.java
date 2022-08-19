package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class AddBeer extends Command {

    private final PackagingID packagingID;
    private final BeerID beerID;
    private final BeerName beerName;
    private final BeerQuantity beerQuantity;
    private final BeerSize beerSize;

    public AddBeer(PackagingID packagingID, BeerID beerID, BeerName beerName, BeerQuantity beerQuantity, BeerSize beerSize) {
        this.packagingID = packagingID;
        this.beerID = beerID;
        this.beerName = beerName;
        this.beerQuantity = beerQuantity;
        this.beerSize = beerSize;
    }

    public PackagingID getPackagingID() {
        return packagingID;
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
