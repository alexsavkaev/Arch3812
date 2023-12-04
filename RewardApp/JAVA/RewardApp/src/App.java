import Fabric.*;
import Product.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();
        iFill(generators, new GemGenerator(), Gem.rarity);
        iFill(generators, new GoldGenerator(), Gold.rarity);
        iFill(generators, new CopperGenerator(), Copper.rarity);
        iFill(generators, new DirtGenerator(), Dirt.rarity);
        iFill(generators, new OreGenerator(), Ore.rarity);
        iFill(generators, new WoodGenerator(), Wood.rarity);
        iFill(generators, new TrashGenerator(), Trash.rarity);
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }
    }

    /** Метод добавляет в список выбранный генератор в указанном количестве. Чем больше в списке присутствие
     * определённого генератора, тем выше вероятность его срабатывания.
     *
     * @param list Наполняемый список
     * @param generator Добавляемый генератор
     * @param value Количество генераторов, добавляемое в список
     */
    public static void iFill(List<ItemGenerator> list, ItemGenerator generator, int value){
        for (int i = 0; i < value; i++) {
            list.add(generator);
        }

    }
}
