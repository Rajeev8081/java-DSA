import java.util.Scanner;

public class Main {
    static boolean ispossible(int arr[], int k , int dist){
        int kidplaced=1;
        int lastkid=arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]-lastkid>=dist){
                kidplaced++;
                lastkid=arr[i];
            }
        }
        return kidplaced>=k;
    }
    static  int racetrack(int arr[],int k ){// k is number of children
        //find mimum than maxima
        if(k>arr.length) return -1;
        int st=0 , end=(int)1e9;
        int ans=-1;
        while (st<=end){
            int mid= st+ (end-st)/2;
            if (ispossible(arr,k,mid)){// can k kids be placed such that no 2 kids have same distance lesser than mid
                ans = mid;
                st= mid+1;
            }else {
            end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the starting point");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("total Children");
        int student = sc.nextInt();
        System.out.println(racetrack(arr,student));
    }
}