package day17;

import java.util.HashSet;

public class q68 {
 public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int x : arr1) {
            set1.add(x);
        }
        for(int x : arr2){
             set2.add(x);
    }
    set1.retainAll(set2);

        System.out.println(set1);
    }

   
}
