//LAB 2Q2
public class Calculator {
    public int addition(int num1, int num2){
        return num1+num2;
    }

    public int sub (int num1, int num2){
    return num1-num2;
    }
    public int div(int num1, int num2){
    return num1/num2;
    }
    public int mul(int num1, int num2){
    return num1*num2;
    }
    public static void main (String[]args){
    Calculator Calculator=new Calculator();
    System.out.println("Add: " +Calculator .addition(10, 5));
    System.out.println("sub: " + Calculator.sub(10, 5));
    System.out.println("mul: " + Calculator.mul(10, 5));
    System.out.println("div: " + Calculator.div(10, 5));}}