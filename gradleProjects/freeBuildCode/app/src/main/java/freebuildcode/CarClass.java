package freebuildcode;

public class CarClass {

    // *** Properties *** //
    String make;
    String model;
    String color;
    int wheels;
    int windows;

    // *** Constructor *** //

    public CarClass(String make, String model, String color, int wheels, int windows) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.windows = windows;
    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        this.make = make;
    }

}
