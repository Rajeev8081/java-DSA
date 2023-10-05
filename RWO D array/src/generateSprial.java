import java.util.Scanner;

public class generateSprial {
    static void printarray(int [][]arr){
        for (int i=0; i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralMatrix(int n){
        int [][] matrix = new int[n][n];
        int toprow =0,rightcol= n-1,bottomrow = n-1,leftcol=0;
        int current = 1;
        while (current<=n*n){
            //toprow -> leftcol to rightcolumn
            for (int i =leftcol;i<=rightcol && current<=n*n;i++){
               matrix[toprow][i]= current;
               current++;
            }
            toprow++;

            //rightcolumn-> toprow to bottom row
            for (int j=toprow;j<=bottomrow && current<=n*n;j++){
                matrix[j][rightcol]=current;
                current++;
            }
            rightcol--;

            //bottomrow -> rightcol to leftcol
            for (int i=rightcol;i>=leftcol && current<=n*n;i--){
               matrix[bottomrow][i]=current;
                current++;
            }
            bottomrow--;

            //leftcol -> bottomrow to toprow
            for (int j=bottomrow; j>=toprow && current<=n*n;j--){
               matrix[j][leftcol]=current;

               current++;
            }
            leftcol++;
        }
        return matrix;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[][] ans=generateSpiralMatrix(n);
        printarray(ans);
    }


}
