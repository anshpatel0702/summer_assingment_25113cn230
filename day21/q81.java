package day21;
import java.util.*;
public class q81 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        int count=0;
        sc.close();
        for(char a:s.toCharArray()){
             count++;
        }
        System.out.print("length of string "+count);
        sc.close();
    }
    
}
