import java.util.Scanner;

public class Main {
     static void printarray(int[] arr , int idx){
         if (idx == arr.length){
             return;
         }
         //self work
          System.out.println(arr[idx]);
         // recursion
         printarray(arr,idx+1);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int idx=0;

        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        printarray(arr,idx);
    }
}