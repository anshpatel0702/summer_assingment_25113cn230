package day16;
import java.util.*;
public class q64 {
   


    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 2, 4, 3, 1, 5};

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) {
            set.add(x);
        }

        System.out.println(set);
    }
}

