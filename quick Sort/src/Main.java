import java.util.Scanner;

public class Main {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void  swap(int arr[], int x, int y){
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]= temp;
    }

    static int partition(int arr[],int st, int end){
        int pivot = arr[st];
        int countlessthanpivot = 0;

        for (int i=st+1;i<=end;i++){
            if (pivot>=arr[i]){
                countlessthanpivot++;
            }
        }
        int pivotindex = st + countlessthanpivot;
        swap(arr,st,pivotindex);

        int i =st, j = end;

        //element lesser  or equal in the left , greater => right side of pivotidx
        while (i< pivotindex && j> pivotindex){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;

            if (i<pivotindex && j> pivotindex){
                swap(arr,i,j);
                i++;
                j--;
            }

        }
        return pivotindex;
    }

    static void  quicksort(int arr[], int st , int end){
        //base case
        if (st>=end) return;
        int pi= partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);
    }




    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       int s =sc.nextInt();
       int arr[]=new int[s];
        System.out.println("enter "+s+" digit array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int st =0;
        int end =arr.length-1;
        System.out.println("this is unsorted array");
        printarray(arr);
        System.out.println("this is sorted array");
        quicksort(arr,st,end);
        printarray(arr);
    }
}