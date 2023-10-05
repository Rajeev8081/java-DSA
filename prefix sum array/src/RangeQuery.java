import java.util.Scanner;

public class RangeQuery {
    static void printarray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    static int[] PrefixSumArray(int []arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            arr[i] = arr[i - 1] + arr[i];
//        }
//return arr;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int[] arr = new int[n+1];


        System.out.println("enter " + n + " elements");
        for (int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.print("enter number of query");
//        int q = sc.nextInt();


//        int []prefix = PrefixSumArray(arr);
//        while (q-->0){
//            System.out.println("enter range");
//            int l=sc.nextInt();
//            int r = sc.nextInt();
//            int sum = prefix[r]-prefix[l-1];
//            System.out.println("sum"+sum);

        }
//        System.out.println("original array");
//        printarray(arr);
    }

