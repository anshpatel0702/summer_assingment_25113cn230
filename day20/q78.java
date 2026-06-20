package day20;

public class q78 {
   

    public static boolean isSymmetric(int[][] a) {

        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        if (isSymmetric(a))
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}
