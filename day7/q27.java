import java.util.*;
public class q27 {
    public static int sumOfDigits(int n) {
       
        if (n==0) {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}
