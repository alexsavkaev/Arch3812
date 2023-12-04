package Product;

public class Copper extends ItemReward{
    @Override
    public void open() {
        System.out.println("Copper!");
    }

    public Copper() {
        rarity = 10;
    }
}
