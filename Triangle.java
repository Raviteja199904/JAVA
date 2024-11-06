import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of rows (or type 0 to exit): ");
            Integer rows = scanner.nextInt();

            if (rows == 0) {
                break; // Exit the loop if the user enters 0
            }

            for (Integer i = 1; i <= rows; i++) {
                System.out.print(" ".repeat(rows - i));
                System.out.println("* ".repeat(i));
            }
        }
        scanner.close();
    }
}
