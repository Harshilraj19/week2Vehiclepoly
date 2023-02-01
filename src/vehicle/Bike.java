package vehicle;

public class Bike extends Vehicle{
    int numHandles;

    public Bike(String color, String make, int numWheels, int year, int numHandles) {
        super(color, make, numWheels, year);
        this.numHandles = numHandles;
    }


    @Override
    public void honk() {
        System.out.println("bike honk honk");
    }

    @Override
    public float calcBill() {
        return numHandles * 10;
    }
}
