package TransportProject;

import OrderPackage.Order;
import DriverPackage.Driver;
import TransportPackage.Vehicle;

// Builder Pattern
public class TransportProject {
    private Vehicle vehicle;
    private Order order;
    private Driver driver;

    private TransportProject(Builder builder) {
        this.vehicle = builder.vehicle;
        this.driver = builder.driver;
        this.order = builder.order;
    }

    public static class Builder {
        private Vehicle vehicle;
        private Order order;
        private Driver driver;

        public Builder vehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder driver(Driver driver) {
            this.driver = driver;
            return this;
        }

        public TransportProject build() {
            return new TransportProject(this);
        }
    }

    @Override
    public String toString() {
        return "Project: {" + vehicle + ", " + order + ", " + driver + '}';
    }
}
