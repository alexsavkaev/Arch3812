package Product;

public class Dirt extends ItemReward{
    public static int rarity = 10;
    @Override
    public void open() {
        System.out.println("Dirt!");
    }
}