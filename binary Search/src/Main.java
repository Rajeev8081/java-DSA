import java.util.Scanner;

public class Main {
    static boolean binarysearch(int arr[], int target){
        int start=0, end=arr.length-1;


        while (start<=end){
            int mid=(start + end)/2;
            if (target==arr[mid]){
                return  true;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return  false;
    }
    //recursion binary search
    static boolean recbs(int arr[],int st,int end,int target){
        if (st>end) return false;
        int mid=(st+end)/2;
        if (target==arr[mid])return true;
        else if (target < arr[mid]){
            return recbs(arr,st,mid-1,target);
        }else {
            return recbs(arr,mid+1,end,target);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter sorted array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("enter the target ");
        int target= sc.nextInt();
//        while (target!= 10){
//            System.out.printf("%d exists in arr %b \n",target, binarysearch(arr,target));
//            target++;
//        }
        int st=0;
        int end=arr.length-1;
        System.out.println(recbs(arr,st,end,target));
    }
}