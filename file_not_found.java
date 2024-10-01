import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_not_found {
    public static void main(String[] args) {
        try {
            File file = new File("fileName.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        }
    }
}
