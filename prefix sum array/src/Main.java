import java.util.Scanner;

public class Main {
    static void printarray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static  void suffixarray(int []arr){
        int n = arr.length;
        for (int i=n-2;i>=0 ;i--){
            arr[i]= arr[i]+arr[i+1];
        }

    }
    //THIS IS second approach using same array
    static void PrefixSumArray(int []arr) {
        int n = arr.length;


        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

    }
    //this is first approach using another arrY
    static int[] prefixsumarray(int []arr){
        int n = arr.length;
        int[] prefix =new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array");
        printarray(arr);
//        int []answer= prefixsumarray(arr);


//        System.out.println("prif sum array");
        System.out.println("print suffix array");
//        PrefixSumArray(arr);
        suffixarray(arr);
          printarray(arr);
    }
}