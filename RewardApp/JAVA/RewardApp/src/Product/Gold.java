package Product;

public class Gold extends ItemReward{
    public static int rarity = 3;

    @Override
    public void open() {
        System.out.println("\u001B[33m"+"Gold!"+"\u001B[0m");
    }
}
