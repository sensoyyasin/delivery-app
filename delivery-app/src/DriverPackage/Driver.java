package DriverPackage;

public class Driver {
    String Name;
    String Surname;
    boolean Licence;

    public Driver(String name, String surname, boolean licence) {
        this.Name = name;
        this.Surname = surname;
        this.Licence = licence;
        if (!this.Licence)
            throw new IllegalArgumentException("Licence is invalid");
    }

    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
    public boolean isLicence() {
        return Licence;
    }

    @Override
    public String toString() {
        return "\nDriver Name : " + Name + ", " + "Driver Surname : " + Surname + ", " + Licence;
    }
}
