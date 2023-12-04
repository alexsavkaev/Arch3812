package Product;

public class Gem extends ItemReward{
    public static int rarity = 1;
    @Override
    public void open() {
        System.out.println("\u001B[36m"+"Gem!"+"\u001B[0m");
    }
}
