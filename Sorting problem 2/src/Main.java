import java.util.Scanner;

public class Main {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void  sort(int arr[]){
        int x=-1;
        int y=-1;
        if (arr.length<=1){
            return;
        }

        for (int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]){
                if (x==-1){
                    x=i-1;
                    y=i;
                }else {
                    y=i;
                }
            }
        }
        //swaping occur
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter unsorted array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        sort(arr);
        printarray(arr);
    }
}