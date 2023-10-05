import java.util.Scanner;

public class Main {
    static void printarray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static  void swaparray(int arr[],int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     static void sortZeroOne(int arr[]){
        int n = arr.length;
        int zeroes= 0;
        for (int i=0;i< n ;i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
// 0 to zeroes-1: zeroes to n-1 : 1
         for (int i=0;i<n;i++){
             if (zeroes > i){
                 arr[i]=0;
             }else {
                 arr[i]=1;
             }
         }
     }
     static void sortZeroOne2approach(int []arr){
        int n = arr.length;
        int left=0; int right=n-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swaparray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
        }

     }}
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
        System.out.println("sorting array");
        sortZeroOne2approach(arr);
        printarray(arr);
    }
}