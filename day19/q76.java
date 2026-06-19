package day19;

import java.util.Scanner;

public class q76 {
    public static void main(String[] args){
        int[][] a=new int[3][3];
        int diasum=0;
        int offdiasum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element of matrix A");
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
             a[i][j] = sc.nextInt();
        }
      }
    for(int i=0;i<3;i++){
        diasum+=a[i][i];
    }
    for(int i=0;i<3;i++){
        offdiasum+=a[i][2-i];
    }
    System.out.println("sum of diagnal element is "+diasum);
    System.out.println("sum of diagnal element is "+offdiasum);
    sc.close();
    }
}
