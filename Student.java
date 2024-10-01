public class Student {
    private String name;
    private int rollNumber;
    private int marksSubject1;
    private int marksSubject2;
    private int marksSubject3;

    public Student(String name, int rollNumber, int marksSubject1, int marksSubject2, int marksSubject3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarksSubject1() {
        return marksSubject1;
    }

    public void setMarksSubject1(int marksSubject1) {
        this.marksSubject1 = marksSubject1;
    }

    public int getMarksSubject2() {
        return marksSubject2;
    }

    public void setMarksSubject2(int marksSubject2) {
        this.marksSubject2 = marksSubject2;
    }

    public int getMarksSubject3() {
        return marksSubject3;
    }

    public void setMarksSubject3(int marksSubject3) {
        this.marksSubject3 = marksSubject3;
    }

    public static void main(String[] args) {
        Student student = new Student("sikander ", 37, 50, 90, 95);
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks Subject 1: " + student.getMarksSubject1());
        System.out.println("Marks Subject 2: " + student.getMarksSubject2());
        System.out.println("Marks Subject 3: " + student.getMarksSubject3());
    }
}
