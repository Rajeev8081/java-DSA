import java.util.Scanner;

public class Main {
    static int PeakIndexMountainArray(int arr[]) {
        int st = 0, end = arr.length - 1;
        int ans=-1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                st = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter sorted array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println(PeakIndexMountainArray(arr));

    }
}