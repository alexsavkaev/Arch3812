package Product;

public class Ore extends ItemReward{
    public static int rarity = 10;
    @Override
    public void open() {
        System.out.println("Ore!");
    }
}