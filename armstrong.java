import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int originalnumber;
        int remainder;
        int result=0;
        originalnumber=n;
        while (originalnumber>0){
            remainder = originalnumber % 10;
            result += remainder*remainder*remainder;
            originalnumber/=10;
        }
        if (result == n){
            System.out.println(n + " is an Armstrong number");
        }
        else{
            System.out.println(n + " is not an Armstrong number");
        }
    }
}