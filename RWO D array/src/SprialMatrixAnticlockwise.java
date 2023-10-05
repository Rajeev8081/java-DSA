import java.util.Scanner;

public class SprialMatrixAnticlockwise {
    static void printarray(int [][]arr){
        for (int i=0; i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void PrintSpiralMatrixanticlockWise(int [][]arr,int r1, int c1){
        int toprow =0,rightcol= c1-1,bottomrow = r1-1,leftcol=0;
        int totalElement = 0;
        while (totalElement<r1*c1){
            //leftcol -> toprow to bottomrow
            for (int i =toprow;i<=bottomrow && totalElement<r1*c1;i++){
                System.out.print(arr[i][leftcol]+" ");
                totalElement++;
            }
            leftcol++;

            //bottomrow-> leftcol to rightcol
            for (int j=leftcol;j<=rightcol && totalElement<r1*c1;j++){
                System.out.print(arr[bottomrow][j]+" ");
                totalElement++;
            }
            bottomrow--;

            //rightcol -> bottomrow to toprrow
            for (int i=bottomrow;i>=toprow && totalElement<r1*c1;i--){
                System.out.print(arr[i][rightcol]+" ");
                totalElement++;
            }
            rightcol--;

            //toprow> rightcol to leftcol
            for (int j=rightcol; j>=leftcol && totalElement<r1*c1;j--){
                System.out.print(arr[toprow][j]+" ");

                totalElement++;
            }
            toprow++;
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
        System.out.println(" sprial matrix");

        PrintSpiralMatrixanticlockWise(arr1,r1,c1);
    }
}
