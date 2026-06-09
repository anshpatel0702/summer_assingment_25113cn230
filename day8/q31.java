package day8;
import java.util.Scanner;

public class q31 {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of rows");
        int num=sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j=0;j<i;j++){
                char c=(char)('A'+j);
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
