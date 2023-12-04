package Product;

public class Trash extends ItemReward{
    public static int rarity = 10;
    @Override
    public void open() {
        System.out.println("Trash!");
    }
}