package Product;

public class Trash extends ItemReward{
    @Override
    public void open() {
        System.out.println("Trash!");
    }
    public Trash() {
        rarity = 10;
    }
}