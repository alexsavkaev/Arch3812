import java.awt.*;
import Enum.*;

public abstract class Car {
    private String model;
    private String maker;
    private Color color;
    private TypeCar body;
    private TypeGearBox gearBox;
    private TypeFuel fuel;
    private float engineCap;
    private int wheelCount;

    public Car(String model, String maker, Color color, TypeCar body,
               TypeGearBox gearBox, TypeFuel fuel, float engineCap, int wheelCount) {
        this.model = model;
        this.maker = maker;
        this.color = color;
        this.body = body;
        this.gearBox = gearBox;
        this.fuel = fuel;
        this.engineCap = engineCap;
        this.wheelCount = wheelCount;
    }
    public void movement(){

    }

    public void maintenance(){

    }

    public boolean trnLights(){
        return true;
    }

    public String getMake() {
        return maker;
    }

    public void setMake(String make) {
        this.maker = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeCar getBodyType() {
        return body;
    }

    public void setBodyType(TypeCar bodyType) {
        this.body = bodyType;
    }

    public int getNumberWheels() {
        return wheelCount;
    }

    public void setNumberWheels(int numberWheels) {
        this.wheelCount = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuel;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuel = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBox;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBox = gearBoxType;
    }

    public Color getBodyColor() {
        return color;
    }

    public void setBodyColor(Color bodyColor) {
        this.color = bodyColor;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }

    public boolean trnWrps(){
        return true;
    }
}
