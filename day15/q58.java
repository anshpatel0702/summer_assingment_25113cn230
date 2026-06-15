package day15;
import java.util.*;
public class q58 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println("enter how many time to rotate an array");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
             int first = arr[0];
            for(int j=0;j<4;j++){
                arr[j]=arr[j+1];
            }
            arr[4]=first;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
