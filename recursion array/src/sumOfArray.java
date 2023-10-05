import java.util.Scanner;

public class sumOfArray{
    static int sumofarray(int arr[], int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        //recursion
        int recur = sumofarray(arr,idx+1);
        // self work
        return  arr[idx] + recur;
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
        System.out.println(sumofarray(arr,idx));
}
}

