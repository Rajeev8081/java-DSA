import java.util.Scanner;

public class TwoDMultiplication {
    static void printarray(int [][]arr){
        for (int i=0; i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Multiply(int [][]arr1,int r1,int c1,int [][]arr2,int r2,int c2){
        if (c1!=r2){
            System.out.println("invalid dimension");
            return;
        }int [][] mul = new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<r2;k++){
                    mul[i][j] += (arr1[i][k]*arr2[k][j]);
                }
            }
        }
        printarray(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix 1");
        System.out.println("enter no. of rows");
        int r1 = sc.nextInt();
        System.out.println("enter no. of columns");
        int c1 = sc.nextInt();
        int [][] arr1 =  new  int[r1][c1];
        System.out.println("enter "+ r1*c1 + " elements");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter matrix 2");
        System.out.println("enter no. of rows");
        int r2 = sc.nextInt();
        System.out.println("enter no. of columns");
        int c2 = sc.nextInt();
        int [][] arr2 =  new  int[r2][c2];
        System.out.println("enter "+ r2*c2 + " elements");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        printarray(arr1);
        System.out.println("matrix 2");
        printarray(arr2);
        System.out.println("multiplication of two matrix");
        Multiply(arr1,r1,c1,arr2,r2,c2);


    }
}
