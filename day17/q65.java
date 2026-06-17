package day17;
import java.util.*;
public class q65 {
    public static void main(String[] args){
    ArrayList<Integer> l1=new ArrayList<>();
    int arr1[]={1,2,3,4,5};
    int arr2[]={4,5,8,9,10};
    for (int x:arr1){
        l1.add(x);
    }
    for(int y: arr2){
        l1.add(y);
    }
    System.out.print(l1);

}

}