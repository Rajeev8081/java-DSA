import java.util.Scanner;

public class Main {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int findmax(int arr[]){
        int max =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void  countsort(int arr[]){
        int max=findmax(arr);
        int count[]=new int[max+1];
        for (int i=0; i<arr.length;i++){
            //0   1  2  3  4  5
            //    2     1     2  means 1 two times aya or 3 one time aya or 5 two times aya
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    //second approach
     static  void Countsort(int arr[]){
        int n = arr.length;
        int [] output =new int[n];
         int max=findmax(arr);
         int count[]=new int[max+1];
         for (int i=0; i<arr.length;i++){
             count[arr[i]]++;
         }
         //make prefix sum array of count array
         for (int i=1;i<count.length;i++){
             count[i] += count[i-1];
         }
  //find the index of each element in the original array and put it output array

         for ( int i=n-1;i>=0;i--){
             int idx =count[arr[i]]-1;
             output[idx]=arr[i];
             count[arr[i]]--;
         }
         //copy all element of output to arr
         for (int i=0;i<n;i++){
             arr[i]=output[i];
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
        countsort(arr);
        printarray(arr);
        Countsort(arr);
        printarray(arr);
    }
}