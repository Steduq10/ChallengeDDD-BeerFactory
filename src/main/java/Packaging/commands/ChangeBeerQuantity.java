package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class ChangeBeerQuantity extends Command {
    private final PackagingID packagingID;
    private final BeerID beerID;
    private final BeerQuantity beerQuantity;

    public ChangeBeerQuantity(PackagingID packagingID, BeerID beerID, BeerQuantity beerQuantity) {
        this.packagingID = packagingID;
        this.beerID = beerID;
        this.beerQuantity = beerQuantity;
    }

    public PackagingID getPackagingID() {
        return packagingID;
    }

    public BeerID getBeerID() {
        return beerID;
    }

    public BeerQuantity getBeerQuantity() {
        return beerQuantity;
    }
}
