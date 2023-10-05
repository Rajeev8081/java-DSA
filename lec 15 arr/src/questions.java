import java.util.Arrays;
import java.util.Scanner;

public class questions {

    static  int[] printsmallandLargestelement(int[]arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }

    static boolean  checkshorting(int[] arr){
        boolean check = true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                check =false;
                break;
            }
        }
        return check;
    }
 static int lastoccurance(int[] arr,int x) {
     int lastindex = -1;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] == x) {
             lastindex += i;
         }

     }
     return lastindex;
 }

    static int countarray(int[] arr,int x){
        int  count = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
return count;
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
        System.out.println("enter value of k");
        int k = sc.nextInt();
//        System.out.println("enter value of x");
//        int x = sc.nextInt();

//        System.out.println("total count "+countarray(arr,x));
//        System.out.println("come last index "+lastoccurance(arr,x));
//        System.out.println("check "+checkshorting(arr));
       int[] ans = printsmallandLargestelement(arr);
        System.out.println("smallest" +ans[0]);
        System.out.println("largest" +ans[1]);
    }
}
