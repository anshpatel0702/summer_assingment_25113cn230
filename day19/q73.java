package day19;
import java.util.*;
public class q73 {
    static int[][] addmatrix(int a[][],int b[][],int c[][]){
           for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
           }
           return c;
    }
    public static void main(String[] args){
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] c=new int[3][3];
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the element of matrix A");
            for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
               a[i][j] = sc.nextInt();
            }
           }
            System.out.println("enter the element of matrix B");
            for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                b[i][j] = sc.nextInt();

            }
           }
           int d[][]=addmatrix(a,b, c);
           System.out.println("Addition of two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
           sc.close();
            }
        }}

