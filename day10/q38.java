

import java.util.Scanner;

public class q38 {
     public static void main(String[] args){
          System.out.print("enter no.of rows");
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          for(int i=num;i>=1;i--){
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
