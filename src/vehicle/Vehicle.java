package vehicle;

    public abstract class Vehicle {

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public int getNumWheels() {
            return numWheels;
        }

        public void setNumWheels(int numWheels) {
            this.numWheels = numWheels;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        private String color;
        private  String make;
        private int numWheels;
        private  int year;

        public Vehicle(){}


        public Vehicle (String color, String make,int numWheels,int year) {
            super();
            this.color=color;
            this.make=make;
            this.numWheels=numWheels;
            this.year=year;

        }
        public  abstract void honk();

        public abstract float calcBill();
        }












