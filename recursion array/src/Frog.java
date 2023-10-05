import java.util.Scanner;

public class Frog {
     static int frogMinCost(int arr[], int idx){
         // base work
         if (idx==arr.length-1){
             return 0;
         }
         //self work  + recursion work
        int recursion1 = Math.abs(arr[idx]-arr[idx+1])+frogMinCost(arr,idx+1);
         // this is also base work
         if (idx==arr.length-2){
             return idx+1;
         }
        int recursion2 =  Math.abs(arr[idx]-arr[idx+2])+frogMinCost(arr,idx+2);

         return Math.min(recursion1,recursion2);
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
        int idx=0;
        System.out.println(frogMinCost(arr,idx));
    }
}
