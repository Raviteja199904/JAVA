package SortingProject;


import java.util.Date;


class Driver extends Person {
    long driversLicenseNumber;
    Date expirationDate;

    public Driver(String name, int age, long licenseNumber) {
        super(name, age);  // Calling the constructor of the Person class
        this.driversLicenseNumber = licenseNumber;
        // You might want to initialize expirationDate too
    }
    public String getName(){
        return name;
    }
    public Long getLicenseNumber() {
        return driversLicenseNumber;
    }
    public 
}


