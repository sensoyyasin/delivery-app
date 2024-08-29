package YukPackage;

abstract public class Yuk {
    String type;

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Yuk [type=" + type + "]";
    }
}
