package TransportPackage;

import LoadPackage.Load;

abstract public class Vehicle {
    String model;
    int capacity;
    int usedCapacity = 0;
    double totalCost = 0;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getUsedCapacity() {
        return usedCapacity;
    }
    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean addLoad(Load load) {
        if (usedCapacity + load.getValue() <= capacity){
            usedCapacity += load.getValue();
            totalCost += load.getValue() * load.getUnitPrice();
        } else {
            throw new IllegalArgumentException("Too much load");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle [model=" + model + ", capacity=" + capacity + ", usedCapacity=" + usedCapacity + ", totalCost=" + totalCost + "]";
    }
}
