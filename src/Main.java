import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Declare a scanner for reading user input
        Scanner in = new Scanner(System.in);

     // Declare variables for reading user choice
        int userChoice;

    // Prompt user to enter the number of days
        System.out.print("Enter the number of days: ");
        userChoice = in.nextInt();

    // Use a switch statement to output the names of the months
        switch (userChoice){
            case 28:
            case 29:
                System.out.println("February");
                break;
            case 30:
                System.out.println("September");
                System.out.println("April");
                System.out.println("June");
                System.out.println("November");
                break;
            case 31:
                System.out.println("January");
                System.out.println("March");
                System.out.println("May");
                System.out.println("July");
                System.out.println("August");
                System.out.println("October");
                break;
            default:
                System.out.println("No months have exactly " + userChoice + " days.");
        }

    }
}
