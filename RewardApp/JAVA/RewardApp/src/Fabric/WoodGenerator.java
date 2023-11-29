package Fabric;

import Interface.iGameItem;
import Product.Wood;

public class WoodGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Wood();
    }
}
