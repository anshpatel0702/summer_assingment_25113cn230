
package day9;
import java.util.Scanner;

public class q35 {
    
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of rows");
        int num=sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0;j<=i;j++){
                char c=(char)('A'+i);
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
}}
