import java.util.Scanner;

public class Main {

    static boolean isdivisionpossible(int arr[], int m, int maxchocolateAllowed ){
        int numberOfStudent=1;
        int choc=0; // number of chochlate currnt student has
        for (int i=0;i< arr.length;i++){
            if (arr[i]>maxchocolateAllowed) return  false;
            if (choc +arr[i]<=maxchocolateAllowed){
                choc += arr[i];
            }else {
                numberOfStudent++;
                choc = arr[i];
            }
        }
        if (numberOfStudent>m)return  false;
        else return true;
    }
    static  int distributechocolate(int arr[], int m){
        // the goal are find minmal maxima
        if (arr.length<m)return  -1;//box hi kam hai student se to ye possible nhi hai
        int ans =0, st=1, end =(int)1e9;

        while (st<= end){
            int mid = st + (end-st)/2;
            if (isdivisionpossible(arr,m,mid)){
                ans = mid;
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter chocolate per box");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("total student");
        int student = sc.nextInt();
        System.out.println(distributechocolate(arr,student));
    }
}