import java.util.Scanner;

public class findUnique {
    static int Findunique(int[]arr){
        int n = arr.length;
        int ans=0;
        for (int i =0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i =0;i<n;i++){
            if (arr[i]>0){
                ans += arr[i];
            }
        }
        return  ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("unique no. is "+Findunique(arr));
    }
}
