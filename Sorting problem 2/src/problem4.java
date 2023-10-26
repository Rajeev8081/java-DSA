import java.util.Scanner;

public class problem4 {
    //A rotated sorted array on which rotation operaytion has been performed
    //some number of times . given a rotated sorted array , find the index of minimum element of array
    //[3,4,5,1,2]   output is 3 index

    static  int findminimumarrayindex(int arr[]){
        int st=0,end =arr.length-1, ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]>arr[end]){
                st=mid+1;
            } else if (arr[mid]<= arr[end]) {
                ans=mid;
                end=mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter rotated array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(findminimumarrayindex(arr));
    }
}
