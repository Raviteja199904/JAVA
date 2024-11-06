// import java.util.*;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Scanner;
// import java.util.stream.*;

// class DriverLicense {
//     private String licenseNumber;
//     private String issueDate;
//     private String expirationDate;

//     public DriverLicense(String licenseNumber) {
//         this.licenseNumber = licenseNumber;
        
//     }

//     public String getLicenseNumber() {
//         return licenseNumber;
//     }
  
// }

// class Person {
//     private String name;
//     private int age;
//     private DriverLicense driverLicense;

//     public Person(String name, int age, DriverLicense driverLicense) {
//         this.name = name;
//         this.age = age;
//         this.driverLicense = driverLicense;
//     }

//     public int getAge() {
//         return age;
//     }

//     public DriverLicense getDriverLicense() {
//         return driverLicense;
//     }

//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         if (driverLicense != null) {
//             System.out.println("License Number: " + driverLicense.getLicenseNumber());
        
//         } else {
//             System.out.println("No Driver License.");
//         }
//     }
// }

// public class Person1 {
//     public static void main(String[] args) {
//         System.out.println("Enter the number of people:  ");
//         Scanner scanner = new Scanner(System.in);
//         int n=scanner.nextInt();
//         scanner.nextLine();
//         List<Person> people = new ArrayList<>();
//         List<DriverLicense> driverLicenses = new ArrayList<>();

//         for (int i = 0; i <=n; i++) {
           
            
//             System.out.println("Enter details for person " + (i + 1) + ":");

//             System.out.print("Name of the Person: ");
//             String name = scanner.nextLine();

//             System.out.print("Age of the Person: ");
//             int age = Integer.parseInt(scanner.nextLine());

//             System.out.print("Do they have a driver's license? (yes/no): ");
//             String hasLicense = scanner.nextLine();

//             DriverLicense license = null;
//             if (hasLicense.equalsIgnoreCase("yes")) {
//                 System.out.print("License Number: ");
//                 String licenseNumber = scanner.nextLine();

                
//                 license = new DriverLicense(licenseNumber);
//             }

//             Person person = new Person(name, age, license);
//             people.add(person);

//             System.out.println();
//         }

//         // Sort only the people with driver licenses by age
//         people.stream()
//                 .filter(person -> person.getDriverLicense() != null) // Only sort those with a driver's license
//                 .sorted(Comparator.comparingInt(Person::getAge).reversed())  // Sort by age in descing  order

//                 .forEach(Person::displayInfo);                      // Display each person with license in sorted order

//         // Display people without sorting those without driver licenses
//         System.out.println("\nPeople without driver licenses (original order):");
//         people.stream()
//                 .filter(person -> person.getDriverLicense() == null)
                
//                 .forEach(Person::displayInfo);

//         scanner.close();
//     }
// }


// //out of memory error.