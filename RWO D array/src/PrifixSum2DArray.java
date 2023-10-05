import java.util.Scanner;

public class PrifixSum2DArray {
    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int rectangleSum(int [][]arr , int l1,int r1,int l2, int r2){
        int sum = 0;
        for (int i=l1 ;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum += arr[i][j];
            }
        }
return sum;
    }

    //second best approach help of prefix sum

    //calculate row side and column side sum
    //array[i][j] = sumrectangle((0,0) (i,j))
    static void findprefixsum(int [][]arr){
        int r = arr.length;
        int c = arr[0].length;

        //traverse horizontal
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        //traverse prefix sum in column
        for (int j =0 ;j<c;j++){
            for (int i=1;i<r;i++){
                arr[i][j] += arr[i-1][j];
            }
        }

    }

    static int rectanglePrifixSumROwColumn(int [][]arr , int l1,int r1,int l2, int r2) {
        int ans=0,sum=0,left=0,top=0,topleft=0;
        findprefixsum(arr);
        sum= arr[l2][r2];
        if (r1>=1){
            left =arr[l2][r1-1];
        }
        if (l1>=1)
        {
            top=arr[l1-1][r2];
        }
        if (r1>=1 && l1>=1){
            topleft = arr[l1-1][r1-1];
        }
        ans= sum-top-left+topleft;
        return ans;
    }


    static int rectanglePrifixSum(int [][]arr , int l1,int r1,int l2, int r2){
        int sum =0;
        findprefixsum(arr);
        for (int i =l1;i<=l2;i++){

            if (r1>=1){
            sum += arr[i][r2]-arr[i][r1-1];

            }else{
                sum += arr[i][r2];
        }
        }
return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no. of rows");
        int r = sc.nextInt();
        System.out.println("enter no. of columns");
        int c = sc.nextInt();
        int [][] arr =  new  int[r][c];
        System.out.println("enter "+ r*c + " elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("print l1 boundries");
        int l1=sc.nextInt();
        System.out.println("print r1 boundries");
        int r1=sc.nextInt();
        System.out.println("print l2 boundries");
        int l2=sc.nextInt();
        System.out.println("print r2 boundries");
        int r2=sc.nextInt();

      //  System.out.println("rectangle sum "+rectangleSum(arr,l1,r1,l2,r2));
//        System.out.println("rectangle sum "+rectanglePrifixSum(arr,l1,r1,l2,r2));
        System.out.println("rectangle sum "+rectanglePrifixSumROwColumn(arr,l1,r1,l2,r2));
    }
}
