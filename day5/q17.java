import java.util.*;
public class q17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out .print("enter a nummer : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
        sc.close();
    }
}
