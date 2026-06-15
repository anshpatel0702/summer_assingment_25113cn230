package day15;
import java.util.*;

public class q57 {
    static int[] reverse(int arr[],int n){
        int s = 0;
        int e = n - 1;
       while (s < e) {
         int temp = arr[s];
         arr[s] = arr[e];
         arr[e] = temp;
         s++;
         e--;
       }
       return arr;
    } 
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] a = reverse(arr,n);
        System.out.print(Arrays.toString(a));
        sc.close();
}

    
}
