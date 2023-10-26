import java.util.Scanner;

public class FindSquareRoot {
    static int findsquareroot(int x){
        int st=0,end=x;
        int ans =-1;

        while (st<=end){
            int mid=(st+end)/2;
            int value=mid*mid; //use long here to avoid overflow

            if (value==x)return mid;
            else if (value>x){
                end=mid-1;
            }else{
                st=st+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int n =sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("enter sorted array");
//        for (int i=0 ;i<arr.length;i++){
//            arr[i] =sc.nextInt();
//        }
        System.out.println("enter the square root ");
        int target= sc.nextInt();
        System.out.println(findsquareroot(target));
    }

}
