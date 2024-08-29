package LoadPackage;

abstract public class Load {
    String type;
    int value; //yük miktarı
    double unitPrice; //birim fiyat

    public String getType() {
        return type;
    }
    public int getValue() {
        return value;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Load [type=" + type + ", value=" + value + ", unitPrice=" + unitPrice + "]";
    }
}
