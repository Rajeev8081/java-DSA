import java.util.Scanner;

public class problem5 {
    //A rotated sorted array on which rotation operaytion has been performed
    //some number of times . given a rotated sorted array , find the index of target element of array
    //[3,4,5,1,2]  target is 4 ka index . output is 1 index.

    static int problem5(int arr[], int target){
        int st=0,end =arr.length-1;  
        while (st<=end){
            int mid=st +(end-st)/2;
            if (arr[mid]==target){
                return mid;
            }


            else if (arr[mid]< arr[end]){ //mid to end is sorted
                if (target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }else end=mid-1;

            }else {
                //st to mid is sortd
//                end=mid-1;
                if (target>arr[st] && target<arr[mid]){
                    end=mid-1;
                }else st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter rotated array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println(problem5(arr,target));
    }
}
