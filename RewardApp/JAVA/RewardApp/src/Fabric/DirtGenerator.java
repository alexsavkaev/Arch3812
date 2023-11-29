package Fabric;

import Interface.iGameItem;
import Product.Dirt;

public class DirtGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Dirt();
    }
}
