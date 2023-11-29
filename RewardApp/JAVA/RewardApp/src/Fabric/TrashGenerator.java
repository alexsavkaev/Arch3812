package Fabric;

import Interface.iGameItem;
import Product.Trash;

public class TrashGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Trash();
    }
}
