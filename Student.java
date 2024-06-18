import java.util.Scanner;

public class Student {
    int id;
    String name;
    public static void main(String[] args){
        Student student = new Student();
        student.details();
        System.out.print("Student Id : " + student.id);
        System.out.print("Student Name : " + student.name);
    }
    public Student(){
        this.id = id;
        this.name = name;
    }
    public void details(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id : ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name : ");
        this.name = scanner.nextLine();
    }

}
