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

    static  void Countsort(int arr[],int place){
        int n = arr.length;
        int [] output =new int[n];
        int max=findmax(arr);
        int count[]=new int[10];
        for (int i=0; i<arr.length;i++){//make frequency array,arr[i]=105 freq[5]++ , place=1
            count[(arr[i]/place)%10]++;
        }
        //make prefix sum array of count array
        for (int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        //find the index of each element in the original array and put it output array

        for ( int i=n-1;i>=0;i--){
            int idx =count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy all element of output to arr
        for (int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

    static void radixsort(int arr[]){
        int max = findmax(arr);//get maximum element
        //apply counting sort to  sort elements based on place value
        for (int place=1;max/place>0;place *= 10){
            Countsort(arr,place);
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
        radixsort(arr);
        printarray(arr);

    }
}