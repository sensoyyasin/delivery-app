package Sofor;

public class Sofor {
    String name;
    String surname;
    boolean licence;

    public Sofor(String name,String surname,boolean licence) {
        this.name = name;
        this.surname = surname;
        this.licence = licence;
        if (!licence)
            throw new IllegalArgumentException("Licence is invalid");
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public boolean isLicence() {
        return licence;
    }

    @Override
    public String toString() {
        return "Surucu{"+name+","+surname+","+licence+"}";
    }
}
