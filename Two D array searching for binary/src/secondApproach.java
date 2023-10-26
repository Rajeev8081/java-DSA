import java.util.Scanner;

public class secondApproach {
    static  boolean searchmatrix2(int arr[][], int target){
     int n=arr.length,m=arr[0].length;
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (arr[i][j] == target) return true;

            if (arr[i][j] < target) {
                //move downword
                i++;
            } else {//move left
                j--;
            }

        }
        return false;
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
        System.out.println("taken target");
        int target=sc.nextInt();
        System.out.println(searchmatrix2(arr1,target));
    }
}
