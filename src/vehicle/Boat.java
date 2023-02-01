package vehicle;

public class Boat extends Vehicle{
    int numPropeller;


    public Boat(String color, String make, int numWheels, int year, int numPropeller) {
        super(color, make, numWheels, year);
        this.numPropeller = numPropeller;
    }

    @Override
    public void honk() {
        System.out.println("boat honk honk");
    }

    @Override
    public float calcBill() {
        return numPropeller * 3000;
    }
}
