import java.util.Scanner;

public class Rotate90clockwise {
    static void printarray(int [][]arr){
        for (int i=0; i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reversearray(int []arr){
        int i=0 , j=arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void  TransposeSecondApproach(int arr[][],int r1,int c1){
        for (int i=0;i<r1;i++){
            for (int j=i;j<c1;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
    }
    static void Rotate(int[][]arr,int n){
        TransposeSecondApproach(arr,n,n);
        //reverse each row
        //one loop are intilize because in 2d array many row
        for (int i=0;i<n;i++){
            reversearray(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

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
        System.out.println(" original matrix");
        printarray(arr1);
        System.out.println("rotate array");
        Rotate(arr1,r1);
        printarray(arr1);

    }
}
