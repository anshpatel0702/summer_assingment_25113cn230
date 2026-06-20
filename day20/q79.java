package day20;
import java.util.*;
public class q79 {
    public static int[] rowSum(int[][] a) {

        int[] sumArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int sum = 0;

            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }

            sumArray[i] = sum;
        }

        return sumArray;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a matrix");
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[] ans = rowSum(a);
        System.out.println(Arrays.toString(ans));
        sc.close();
    } 
}

