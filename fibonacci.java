import java.util.Scanner;
class fibanacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci Series: ");
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++){
            int temp = a+b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
    }
}