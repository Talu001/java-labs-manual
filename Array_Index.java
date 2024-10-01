import java.util.Scanner;
public class Array_Index {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        try {
                System.out.println("Array has the follwing: ");
            for(int i=0;i<5;i++){
                System.out.print(array[i]+" ");
            }
            
            System.out.print("\nEnter the index (0 to 4) : ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter an index between 0 and " + (array.length - 1));
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        } finally {
            scanner.close();
        }
    }}
