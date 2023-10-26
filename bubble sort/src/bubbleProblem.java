import java.util.Scanner;

public class bubbleProblem {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void bubbleproblem(int arr[]){
        for (int i=0;i<arr.length;i++){
            int j=i;
            for (j=0;j<arr.length-1;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j++;

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
        bubbleproblem(arr);
        printarray(arr);
    }
}
