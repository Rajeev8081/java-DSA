import java.util.Scanner;

public class Spiralmatrix {
    static void printarray(int [][]arr){
        for (int i=0; i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void PrintSpiralMatrix(int [][]arr,int r1, int c1){
        int toprow =0,rightcol= c1-1,bottomrow = r1-1,leftcol=0;
        int totalElement = 0;
        while (totalElement<r1*c1){
            //toprow -> leftcol to rightcolumn
            for (int i =leftcol;i<=rightcol && totalElement<r1*c1;i++){
                System.out.print(arr[toprow][i]+" ");
                totalElement++;
            }
            toprow++;

            //rightcolumn-> toprow to bottom row
            for (int j=toprow;j<=bottomrow && totalElement<r1*c1;j++){
                System.out.print(arr[j][rightcol]+" ");
                totalElement++;
            }
            rightcol--;

            //bottomrow -> rightcol to leftcol
            for (int i=rightcol;i>=leftcol && totalElement<r1*c1;i--){
                System.out.print(arr[bottomrow][i]+" ");
                totalElement++;
            }
            bottomrow--;

            //leftcol -> bottomrow to toprow
            for (int j=bottomrow; j>=toprow && totalElement<r1*c1;j--){
                System.out.print(arr[j][leftcol]+" ");

                totalElement++;
            }
            leftcol++;
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

        PrintSpiralMatrix(arr1,r1,c1);
//        printarray(arr1);

    }
}
