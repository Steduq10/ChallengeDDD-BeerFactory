package Packaging.commands;

import Packaging.values.BeerID;
import Packaging.values.BeerName;
import Packaging.values.PackagingID;
import co.com.sofka.domain.generic.Command;

public class ChangeBeerName extends Command {
    private final PackagingID packagingID;
    private final BeerID beerID;
    private final BeerName beerName;

    public ChangeBeerName(PackagingID packagingID, BeerID beerID, BeerName beerName) {
        this.packagingID = packagingID;
        this.beerID = beerID;
        this.beerName = beerName;
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
}
