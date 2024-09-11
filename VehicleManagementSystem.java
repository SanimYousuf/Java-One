class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle 
{
    private int NumberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        NumberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors()
    {
        return NumberOfDoors;
    }
    public void setNumberOfDoors (int NumberOfDoors)
    {
        this.NumberOfDoors = NumberOfDoors;
    }
    
    public void start() {
        System.out.println("Car starts with a key.");
    }

}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String make, String model, int year, int loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    public void start() {
        System.out.println("Truck starts with a heavy-duty engine.");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;
    }

    public void start() {
        System.out.println("Bike starts with a kick.");
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    } 

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}

abstract class Maintenance 
{
    public abstract void performMaintenance(); 
}

class CarMaintenance extends Maintenance {
    public void performMaintenance() 
    {
        System.out.println("Performing maintenance on Car: Checking engine and tires!");
    }
}

class TruckMaintenance extends Maintenance {
    public void performMaintenance()
    {
        System.out.println("Performing maintenance on Truck: Checking engine and trailers!");
    }
}

class BikeMaintenance extends Maintenance {
    public void performMaintenance()
    {
        System.out.println("Performing maintenance on Bike: Checking engine and fuel!");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args)
    {
        Car car = new Car("Toyota", "Noah", 2023, 7);
        Truck truck = new Truck("Man", "Unknown", 2017, 10000);
        Bike bike = new Bike("Suzuki", "Gixxer", 2023, true);

        car.start();
        truck.start();
        bike.start();

        Maintenance cm = new CarMaintenance();
        Maintenance tm = new TruckMaintenance();
        Maintenance bm = new BikeMaintenance();

        cm.performMaintenance();
        tm.performMaintenance();
        bm.performMaintenance();

    }   
}
