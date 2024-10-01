import java.util.Scanner;
public class Array_finder{
    public static void main(String []args){
    int [] numofstudents={2,4,5,7,8,9,12,45};
        int number_of_Array;
    Scanner sc= new Scanner(System.in);
    try {
        System.out.println("Enter Index Number Of Array Number; ");
        int a = sc.nextInt();
        number_of_Array=a;
        System.out.println("Number Of Given Index is ; ");
        System.out.println(numofstudents[number_of_Array]);
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error:INVALID INDEX NUMBER....");
      
    }
    }
}