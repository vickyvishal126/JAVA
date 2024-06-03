import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int dec=sc.nextInt();
        int rev=0;
        int rem;
        while(dec>0) {
            rem=dec%10;
            rev=(rev*10)+rem;
            dec/=10;
        }
        System.out.println(rev);
    }
}