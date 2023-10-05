import java.util.Arrays;
import java.util.Scanner;

public class secondsmallest {
    static  int Firstsmallest(int arr[]){
        int mx = Integer.MAX_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i]<mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static  int Secondsmallest(int arr[]){
        int mx = Firstsmallest(arr);

        for (int i=0;i<arr.length;i++){
            if( mx==arr[i]){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondmin = Firstsmallest(arr);
        return secondmin;
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
        System.out.println("first smallest number "+ Secondsmallest(arr));
    }
}
