package Fabric;

import Interface.iGameItem;
import Product.Ore;

public class OreGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Ore();
    }
}
