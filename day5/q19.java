import java.util.*;
public class q19 {
    public static void main( String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
