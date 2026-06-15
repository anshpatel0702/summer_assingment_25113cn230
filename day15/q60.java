package day15;

import java.util.*;

public class q60 {
       public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 4, 0};

        int j = 0; // position for next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
        
    }
}

