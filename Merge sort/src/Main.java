import java.util.Scanner;

public class Main {
    static void printarray(int []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void merge(int arr[],int l,int mid , int r){
        int n1 =  mid-l+1; //suppose [1, 2,  3 , 4 ,5,6]
        int n2 =  r-mid;      //      l     mid       r
         int left[] = new int [n1];
         int right[] = new int [n2];

         int i,j,k;  //fill the empty array
         for (i=0;i<n1;i++)  left[i] = arr[l+i];
         for (j=0;j<n2;j++)  right[j] = arr[mid+1+j];

         i=0;
         j=0;
         k=l;
         while(i<n1 && j<n2){
             if (left[i]<= right[j]){
                 arr[k++]= left[i++];

             }else
                 arr[k++]=right[j++];
         }
         while(i<n1)
             arr[k++] = left[i++];

        while(j<n2)
            arr[k++] = right[j++];


    }
    static void mergesort(int arr[] ,int l ,int r){
        if(l>=r) return;
        int mid= (l + r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter unsorted array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int l=0;
        int r=arr.length-1;
        mergesort(arr,l,r);
        printarray(arr);
    }
}