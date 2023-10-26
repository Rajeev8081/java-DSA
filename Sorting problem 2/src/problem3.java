import java.util.Scanner;

public class problem3 {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int arr[] , int x, int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]= temp;
    }
    static  void  problemm3( int arr[]){
        int left=0;
        int mid=0;
        int right=arr.length-1;
        if (mid>right) return;
        while (mid<=right){
            if (arr[mid]==0){
                swap(arr,mid,left);
                left++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else if (arr[mid]==2){
                swap(arr,mid,right);
                right--;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter unsorted array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        problemm3(arr);
        printarray(arr);
    }
}
