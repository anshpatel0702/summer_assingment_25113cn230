package day18;

import java.util.Arrays;

public class q70 {
    public static void main(String[] args) {
        int[] a = {1, 4, 4, 3, 5, 7, 8, 2, 9};
        for (int i = 0; i < a.length; i++) {
            int min=i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.print(Arrays.toString(a));
    }
}


