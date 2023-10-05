import java.util.Scanner;


public class sortSquarearray {
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

    static void reversarray(int []arr){
        int i=0,  j=arr.length-1;
        while (i<j){
            swaparray(arr,i ,j);
            i++;
            j--;
        }
    }
    static int [] sortsquarearray(int []arr){
        int n= arr.length;
        int left = 0, right = n-1;
        int[] ans = new int [n];
//        int k =0;
        int k =n-1;
        while (left<= right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }else {
                ans[k--]=arr[right]*arr[right];
                right--;
            }

        }
return ans;
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
        System.out.println("sort square array");
        int []answer= sortsquarearray(arr);
//        reversarray(answer);
        printarray(answer);
//
    }
}
