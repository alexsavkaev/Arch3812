package Product;

public class Ore extends ItemReward{
    @Override
    public void open() {
        System.out.println("Ore!");
    }
    public Ore() {
        rarity = 10;
    }
}