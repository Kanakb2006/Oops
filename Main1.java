class Vehicle {
    void drive() {
        System.out.println("The vehicle is driving");
    }
   }
   class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
   }
   
   public class Main1 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(); 
        myVehicle.drive();                 
        Vehicle myCar = new Car();         
        myCar.drive();                    
    }
   }