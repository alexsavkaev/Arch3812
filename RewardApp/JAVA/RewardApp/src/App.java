import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();
        iFill(generators, new GemGenerator());
        iFill(generators, new GoldGenerator());
        iFill(generators, new CopperGenerator());
        iFill(generators, new DirtGenerator());
        iFill(generators, new OreGenerator());
        iFill(generators, new WoodGenerator());
        iFill(generators, new TrashGenerator());
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

     */
    public static void iFill(List<ItemGenerator> list, ItemGenerator generator){
        for (int i = 0; i < generator.rarity; i++) {
            list.add(generator);
        }

    }
}
