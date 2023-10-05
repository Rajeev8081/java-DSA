import java.util.Scanner;

public class patitionequalarray {
    static int totalSum(int []arr){
        int totalsum=0;
        for (int i=0;i<arr.length;i++){
             totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalSumPartition(int[]arr){
        int totalsum = totalSum(arr);
         int prefix= 0;
         for (int i=0;i<arr.length;i++){
             prefix += arr[i];
             int suffixsum = totalsum-prefix;
             if (suffixsum==prefix){
                 return true;
             }
         }

return false;
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
        System.out.println("Equal partition "+equalSumPartition(arr));
    }
}
