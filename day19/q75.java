package day19;
import java.util.*;
public class q75 {
    static int[][] transpose(int a[][],int c[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                  c[i][j]=a[j][i];
            }
        }
       return c;
    }
    public static void main(String[] args){
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
         Scanner sc=new Scanner(System.in);
          System.out.println("enter the element of matrix A");
            for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
               a[i][j] = sc.nextInt();

    }
}
    int d[][]=transpose(a,b);
    System.out.println("transpose of a matrix is");
    for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
              System.out.print(d[i][j]+" ");
    }
     System.out.println();
}sc.close();
    }
}