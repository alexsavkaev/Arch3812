package Fabric;

import Interface.iGameItem;

public abstract class ItemGenerator {
    public int rarity;

    public abstract iGameItem createItem();
    public void openReward(){
        createItem().open();
    }

}
