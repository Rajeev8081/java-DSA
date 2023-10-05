import java.util.Scanner;

public class arrayMax {
    static int arraymax(int arr[], int idx){
        if (idx==arr.length-1){
            return  arr[idx];
        }
        // small problem --> idx +1 , end of the array  and find max
        int smallwork = arraymax(arr, idx+1);

        // self work and final work (compare smallwork and self work which are maaximum)
         return  Math.max(arr[idx] , smallwork);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int idx = 0;

        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arraymax(arr, idx));
    }
}
