import java.util.Scanner;

public class problem2 {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void problem2(int arr[]){
        int left=0;
        int right=arr.length-1;
        if (left==right){
            return;
        }
        while (left<right){
            while (arr[left]<0) left++;
            while (arr[right]>=0) right--;
            if (arr[left]>0 && arr[right]<0){
                //swap
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
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
        problem2(arr);
        printarray(arr);
    }
}
