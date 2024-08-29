package OrderPackage;

import LoadPackage.Load;
import TransportPackage.Vehicle;

import java.util.List;

public class Order {
    public enum OrderType {
        PREPAYMENT,
        POSTPAYMENT
    }
    private OrderType orderType;
    private List<Load> loads;

    public Order(OrderType orderType, List<Load> loads) {
        this.orderType = orderType;
        this.loads = loads;
    }

    public OrderType getOrderType() {
        return orderType;
    }
    public List<Load> getLoad() {
        return loads;
    }
    public void  setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }

    public double calculateTotalCost(Vehicle vehicle) {
        double baseCost = vehicle.getTotalCost();

        switch (orderType) {
            case PREPAYMENT:
                return Math.round(baseCost * 0.85); // %15 discount
            case POSTPAYMENT:
                return Math.round(baseCost * 1.10); // + %10
            default:
                return Math.round(baseCost);
        }
    }

    @Override
    public String toString() {
        return "\nOrder: {" + orderType + " " + loads + " }";
    }
}
