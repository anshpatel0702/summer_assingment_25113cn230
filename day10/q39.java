

import java.util.Scanner;

public class q39 {
     public static void main(String[] args){
          System.out.print("enter no.of rows");
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            } 
              System.out.println();
            
    }
    sc.close();
}
}
