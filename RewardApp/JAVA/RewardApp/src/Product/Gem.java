package Product;

public class Gem extends ItemReward{
    @Override
    public void open() {
        System.out.println("\u001B[36m"+"Gem!"+"\u001B[0m");
    }
}
