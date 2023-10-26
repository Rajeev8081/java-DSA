import java.util.Scanner;

public class Main {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void selectionsort(int arr[]){
        //first loop i to n-1
        for (int i =0;i<arr.length-1;i++){//represent the current index
            int minmum_index=i;
            for (int j=i+1;j<arr.length;j++){
                //then comapre karenege ki  minmum  uske bgl vale se bara hai kya agr ha to minmum change ho jayega
                if (arr[minmum_index]>arr[j]){
                    minmum_index=j;
                }
                // minmum change hone ke bad swap ho jayega i vale element se
                int temp= arr[i];
                arr[i]=arr[minmum_index];
                arr[minmum_index]=temp;
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
        selectionsort(arr);
        printarray(arr);
    }
}