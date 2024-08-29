package TasitPackage;

abstract public class Tasit {
    String model;
    int kapasite;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getKapasite() {
        return kapasite;
    }
    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    @Override
    public String toString() {
        return "Tasit [model=" + model + ", kapasite=" + kapasite + "]";
    }
}
