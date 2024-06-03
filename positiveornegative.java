import java.util.Scanner;
class MulTable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if( n>=0) {
            System.out.println(n + " is Positive.");
        }
        else{
            System.out.println(n + " is Negative.");
        }
    }
}
