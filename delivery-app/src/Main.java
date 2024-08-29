import DriverPackage.Driver;
import LoadPackage.DryFood;
import LoadPackage.Load;
import LoadPackage.WetFood;
import OrderPackage.Order;
import TransportPackage.*;
import TransportProject.TransportProject;

import java.util.ArrayList;
import java.util.List;

// Factory Method Pattern
class VehicleFactory {

    //Singleton instance
    private static VehicleFactory instance;

    private VehicleFactory() {}

    public static VehicleFactory getInstance() {
        if (instance == null) {
            instance = new VehicleFactory();
        }
        return instance;
    }

    public Vehicle createTasit(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "truck":
                return new Truck();
            case "plane":
                return new Plane();
            case "ship":
                return new Ship();
            case "train":
                return new Train();
            default:
                throw new IllegalArgumentException("Invalid Vehicle Type: " + vehicleType);
        }
    }
}

class ShellColorCodes {
    public static final String RESET = "\033[0m";
    public static final String GREEN = "\033[0;92m";
    public static final String YELLOW = "\033[0;93m";
    public static final String RED = "\033[0;91m";
}

public class Main {
    public static void main(String[] args) {

        System.out.println(ShellColorCodes.YELLOW + "Creating objects..." + ShellColorCodes.RESET);
        VehicleFactory vehicleFactory = VehicleFactory.getInstance();
        Vehicle vehicle = vehicleFactory.createTasit("truck");
        Driver driver = new Driver("Sensoy", "Yasin", true);

        //Dry food
        Load dryFood = new DryFood();
        dryFood.setValue(50);
        vehicle.addLoad(dryFood);

        //Liquid food
        Load wetFood = new WetFood();
        wetFood.setValue(100);
        vehicle.addLoad(wetFood);

        List<Load> loads = new ArrayList<>();
        loads.add(dryFood);
        loads.add(wetFood);

        Order order = new Order(Order.OrderType.POSTPAYMENT, loads);
        double totalCost = order.calculateTotalCost(vehicle);

        System.out.println(ShellColorCodes.GREEN + "Building TransportProject object..." + ShellColorCodes.RESET);
        TransportProject project = new TransportProject.Builder()
                .driver(driver)
                .vehicle(vehicle)
                .order(order)
                .build();
        System.out.println(project);
        System.out.println("Final vehicle state: " + vehicle);
        System.out.println("Total Cost after Payment Method: " + totalCost);
        System.out.println(ShellColorCodes.RED + "End of the Main program..." + ShellColorCodes.RESET);
        return;
    }
}