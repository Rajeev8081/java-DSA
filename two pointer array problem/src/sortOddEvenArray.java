import java.util.Scanner;

public class sortOddEvenArray {
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
    static void sortOddEvenarray(int []arr){
        int n = arr.length;
        int left=0; int right=n-1;
        while (left<right){
            if (arr[left] %2==1 && arr[right] %2==0){
                swaparray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1){
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
        sortOddEvenarray(arr);
        printarray(arr);
    }

}
