import java.util.Scanner;

public class Main {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
    }
    static void Bubblesort(int arr[]){
        // first loop . no. of passes/ n-1 iteration
        for (int i=0;i<arr.length-1;i++){
            boolean flag =false;//has any swapping happend
            //second loop to compare with next element
            for (int j=0;j<arr.length-i-1;j++){
                //last i element are already at correct s orted positions
                //so no need to check
                if (arr[j]>arr[j+1]){
                    // than swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag =true; /// swappng happened

                }
                if(flag==false){// have any swapping happend
                    return;
                }
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
        Bubblesort(arr);
        printarray(arr);
    }
}