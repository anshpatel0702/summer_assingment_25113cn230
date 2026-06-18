package day18;

import java.util.Arrays;

public class q72 {
     public static void main(String[] args){
    int a[]={1,4,4,3,5,7,8,2,9};
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1-i;j++){
            if(a[j]<a[j+1]){ 
           int temp=a[j];
           a[j]=a[j+1];
           a[j+1]=temp;
            }
        }
    }
    System.out.print(Arrays.toString(a));
}
}
