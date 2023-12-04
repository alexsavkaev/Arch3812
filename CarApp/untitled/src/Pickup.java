import java.awt.*;
import Enum.*;
import Interfaces.IFuelStation;
import Interfaces.IWashCar;

public class Pickup extends Car implements IFuelStation, IWashCar {
    private float loadCapacity;

    public Pickup(String model, String maker, Color color, TypeGearBox gearBox,
                  TypeFuel fuel, float engineCap, int wheelCount, float loadCapacity) {
        super(model, maker, color, TypeCar.PICKUP, gearBox, fuel, engineCap, wheelCount);
        this.setBodyType(TypeCar.PICKUP);
    }

    @Override
    public void fuelUp() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }
}
