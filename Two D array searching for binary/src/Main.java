import java.util.Scanner;

public class Main {
    static boolean searchmatrix(int arr[][], int target) {
        //n is number of row       m is number of column
        int n = arr.length, m = arr[0].length;
        int st = 0, end = n*m -1;
        while (st<= end){
            int mid= st + (end-st)/2;
            int midelement= arr[mid/m][mid%m];

            if (midelement== target) return true;

            if (target<midelement){
                end=mid-1;
            }else {
                st=mid+1;
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
        System.out.println(searchmatrix(arr1,target));
    }
}