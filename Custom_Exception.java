import java.util.Scanner;

// Custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a non-negative number: ");
                int num = in.nextInt();
                if (num < 0) {
                    throw new NegativeNumberException("Negative numbers are not allowed");
                }
                System.out.println("You entered: " + num);
                break;
            } catch (NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred");
                in.close();
                return;
            }
        }
        in.close();
    }
}