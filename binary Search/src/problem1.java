import java.util.Scanner;

public class problem1 {
    static int firstoccurance(int arr[],int target){
        int st=0,end=arr.length-1,update=-1;
        while (st<=end){
            int mid=(st+end)/2;
            if (target==arr[mid]){
                update= mid;
                end =mid-1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {
                st=mid+1;
            }
        }
        return update;
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
        System.out.println(firstoccurance(arr,target));
    }

}
