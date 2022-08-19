package Packaging.commands;

import Packaging.values.*;
import co.com.sofka.domain.generic.Command;

public class ChangeBeerSize extends Command {

    private final PackagingID packagingID;
    private final BeerID beerID;
    private final BeerSize beerSize;

    public ChangeBeerSize(PackagingID packagingID, BeerID beerID, BeerSize beerSize) {
        this.packagingID = packagingID;
        this.beerID = beerID;
        this.beerSize = beerSize;
    }

    public PackagingID getPackagingID() {
        return packagingID;
    }

    public BeerID getBeerID() {
        return beerID;
    }

    public BeerSize getBeerSize() {
        return beerSize;
    }
}
