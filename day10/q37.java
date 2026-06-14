
import java.util.*;
public class q37 {
    public static void main(String[] args){
          System.out.print("enter no.of rows");
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
            
          }  
          sc.close();  
    }
}
