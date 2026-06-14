import java.util.*;
public class q20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int max=1;
        int flag;
        for(int i=2; i<=num; i++){
            if(num%i==0){
                flag=1;
                for(int j=2; j<=i/2; j++){
                    if(i%j==0){
                        flag=0;
                        break;
                    }
                    
                }
                if(flag==1){
                    max=i;
                }
            }
        }
        System.out.println("largest prime factor of "+num+" is "+max);
        sc.close();
    }
    
}
