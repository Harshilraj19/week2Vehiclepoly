package vehicle;

public class Car extends Vehicle{
    boolean hasBooth;


    public Car(String color, String make, int numWheels, int year, boolean hasBooth) {
        super(color, make, numWheels, year);
        this.hasBooth = hasBooth;
    }

    @Override
    public void honk() {
        System.out.printf("beep beep");
    }

    @Override
    public float calcBill() {
        return hasBooth ? 10000: 1000;

    }
}
