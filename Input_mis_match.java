import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_mis_match {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
            in.next();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        } finally {
            in.close();
        }
    }
}
