package SortingProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // Loop to collect data for 10 people
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter gender: ");

            System.out.println("Does this person have a license? (yes/no): ");
            String hasLicense = scanner.nextLine();

            if (hasLicense.equalsIgnoreCase("yes")) {
                System.out.println("Enter license number: ");
                long licenseNumber = scanner.nextLong();

                Driver driver = new Driver(name, age,licenseNumber);
                drivers.add(driver);
                System.out.println("Driver added: " + driver.getName());
            } else {
                Person person = new Person(name, age);
                people.add(person);
                System.out.println("Person added: " + person.getName());
            }
        }

        scanner.close();

        // Sort drivers by license number in ascending order
        Collections.sort(drivers, Comparator.comparing(Driver::getLicenseNumber));

        // Sort people by age in descending order
        Collections.sort(people, (p1, p2) -> p2.getAge() - p1.getAge());

        // Display all drivers and people
        System.out.println("\nDrivers:");
        for (Driver driver : drivers) {
            System.out.println(driver.getName() + ", Age: " + driver.getAge() + ", Gender: "  + ", License: " + driver.getLicenseNumber());
        }

        System.out.println("\nPeople:");
        for (Person person : people) {
            System.out.println(person.getName() + ", Age: " + person.getAge() );
        }
    }
}
