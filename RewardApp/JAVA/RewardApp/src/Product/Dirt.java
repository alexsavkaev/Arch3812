package Product;

public class Dirt extends ItemReward{
    @Override
    public void open() {
        System.out.println("Dirt!");
    }
    public Dirt() {
        rarity = 10;
    }
}