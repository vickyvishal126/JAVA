import java.util.Scanner;

class MulTable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the end value: ");
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            int c=i*n;
            System.out.println(i + " * " + n + " = " + c);
        }
    }
}
