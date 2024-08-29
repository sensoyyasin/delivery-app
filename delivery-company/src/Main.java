import Siparis.Siparis;
import Sofor.Sofor;
import TasimaProjesi.TasimaProjesi;
import TasitPackage.*;
import YukPackage.KuruYuk;
import YukPackage.Yuk;

// Factory Method Pattern - bir sınıfın hangi nesne türünü oluşturacağına alt sınıflarının karar vermesine izin verir
class TasitFactory {
    public static Tasit createTasit(String tasitTipi) {
        switch (tasitTipi.toLowerCase()) {
            case "kamyon":
                return new Kamyon();
            case "tir":
                return new Tir();
            case "tanker":
                return new Tanker();
            case "tren":
                return new Tren();
            default:
                throw new IllegalArgumentException("Invalid tasit tipi: " + tasitTipi);
        }
    }
}

class ShellRenkKodlari {
    public static final String RESET = "\033[0m";
    public static final String YESIL = "\033[0;92m";
    public static final String SARI = "\033[0;93m";
    public static final String KIRMIZI = "\033[0;91m";
}

public class Main {
    public static void main(String[] args) {
        System.out.println(ShellRenkKodlari.SARI + "Creating objects..." + ShellRenkKodlari.RESET);

        Tasit tasit = TasitFactory.createTasit("kamyon");
        Sofor sofor = new Sofor("Yasin", "Sensoy", true);
        Yuk yuk = new KuruYuk();
        Siparis siparis = new Siparis(Siparis.OdemeTipi.OnOdeme, yuk);

        System.out.println(ShellRenkKodlari.YESIL + "Building TasimaProjesi object..." + ShellRenkKodlari.RESET);

        TasimaProjesi proje = new TasimaProjesi.Builder()
                .tasit(tasit)
                .sofor(sofor)
                .siparis(siparis)
                .build();

        System.out.println(proje);
        System.out.println(ShellRenkKodlari.KIRMIZI + "End of the Main program..." + ShellRenkKodlari.RESET);
    }
}