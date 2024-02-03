import java.util.ArrayList;
/*
 * Demonstarates the system’s cababilities and 
 * tests the methods in your classes. In this program, create an array list of cars and store in it at 
 * least three car objects. Display the contents of this array (produce a nicely formatted description 
 * of each car object such as car’s make, model, year, price, and the car’s owner information).
 */
public class UseCar {
    
    public static void main(String[] args) {
        CarOwner owner1 = new CarOwner("Trent Johnson", "711 Poplar Way", new ArrayList<Car>());
        CarOwner owner2 = new CarOwner("Brayden Bond", "456 Elm St", new ArrayList<Car>());
        CarOwner owner3 = new CarOwner("Eric Reyes", "789 Oak Ave", new ArrayList<Car>());
        
        Car car1 = new Car("Honda", "Passport", 2022, 30000.00);
        Car car2 = new Car("Honda", "Pilot", 2013, 10000.00);
        Car car3 = new Car("Ford", "Bronco", 2024, 30000.00);
        Car car4 = new Car("Toyota", "Rav4", 2021, 25000.00);
        Car car5 = new Car("Ford", "Fusion", 2018, 10000.00);
        
        // Set Trent Johnson as the owner of car1 and car2
        owner1.addCar(car1);
        owner1.addCar(car2);

        // Set Brayden Bond as the owner of car3
        owner2.addCar(car3);

        // Set Eric Reyes as the owner of car4 and car5
        owner3.addCar(car4);
        owner3.addCar(car5);
            
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        ArrayList<CarOwner> owners = new ArrayList<CarOwner>();
        owners.add(owner1);
        owners.add(owner2);
        owners.add(owner3);
        
        // for each owner, for each car, print the car's information and the owner's information
        for (CarOwner owner : owners) {
            System.out.println("############");
            System.out.println(owner.getName());
            System.out.println(owner.getAddress());
            for (Car car : owner.getCars()) {
                System.out.println("Make: " + car.getMake());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Price: " + car.getPrice());
                System.out.println("");
            }
            System.out.println("############");
        }
    }
}