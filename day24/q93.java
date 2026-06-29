package day24;
import java.util.*;
public class q93 {
    public void stringrotation(String s,int n){
        int k=n%s.length();
        String r=s.substring(k)+s.substring(0,k);
        System.out.print("rotated string "+r);
    }
    public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter a string");
       String s= sc.nextLine();
       System.out.print("enter how many times to rotate a string");
       int n =sc.nextInt();
        q93 sol=new q93();
       sol.stringrotation(s,n);
       sc.close();

    }
}
