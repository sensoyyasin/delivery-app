package Siparis;

import YukPackage.Yuk;

public class Siparis {
    public enum OdemeTipi {
        OnOdeme,
        SonradanOdeme
    }
    private OdemeTipi odemeTipi;
    private Yuk yuk;

    public Siparis(OdemeTipi odemeTipi, Yuk yuk) {
        this.yuk = yuk;
        this.odemeTipi = odemeTipi;
    }

    public OdemeTipi getOdemeTipi() {
        return odemeTipi;
    }
    public void setOdemeTipi(OdemeTipi odemeTipi) {
        this.odemeTipi = odemeTipi;
    }
    public Yuk getYuk() {
        return yuk;
    }
    public void setYuk(Yuk yuk) {
        this.yuk = yuk;
    }

    @Override
    public String toString(){
        return "Siparis{"+odemeTipi+","+yuk+'}';
    }
}
