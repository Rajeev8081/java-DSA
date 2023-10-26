import java.util.Scanner;

public class findPeakElement {
    static int peakelement(int arr[]){
        int st=0, end =arr.length-1;
        while (st<=end){
            int mid =st +(end-st)/2;
            if ((mid==0 || arr[mid]>arr[mid-1] )&& (mid==arr.length-1 || arr[mid]> arr[mid+1])) {
                return mid;
            }
            if (arr[mid]<arr[mid+1]){//uphill or you can say ascending
                st=mid+1;
            }else { //
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array so, i find peak element");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(peakelement(arr));
    }
}
