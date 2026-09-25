import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner for user input
        // Ask the user to enter their birth month
        // Check if the month is between 1 and 12
        // If the month is between 1 and 12, display the birth month
        // Otherwise, display an error message

        Scanner in = new Scanner(System.in);

        int month = 0;

        System.out.print("Enter your birth month: ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            String trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
        }
    }
}
