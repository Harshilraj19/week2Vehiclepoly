package vehicle;

public class Garage {
    public static void main(String[] args) {

      Vehicle [] machines = {new Car("red", "ford",2,2012,true),
              new Car("blue","toyota",3,2015,true),
              new Bike("blue","bmx",2,2000,1),
              new Bike("green","fsst",2,2001,1),
              new Boat("brown","fasto",0,1925,5),
              new Boat("black","make25",0,1967,5)
      };


    float totalBill = 0;
      for (Vehicle machine:machines) {
          totalBill += machine.calcBill();
          machine.calcBill();
          machine.honk();


          }
        System.out.printf("total bill is %f",totalBill);


          }

      }
