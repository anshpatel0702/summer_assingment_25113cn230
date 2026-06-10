

import java.util.Scanner;

public class q40 {
    
     public static void main(String[] args){
          System.out.print("enter no.of rows");
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(char j='A';j<=(char)('A'+i-1);j++){
                System.out.print(j);
            }
            for( char j=(char)('A'+i-2);j>='A';j--){
                System.out.print(j);
            } 
              System.out.println();
            
    }
    sc.close();
}
}
