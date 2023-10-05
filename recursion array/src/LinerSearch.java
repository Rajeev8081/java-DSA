import java.util.Scanner;

public class LinerSearch {
    static boolean linersearch( int arr[], int target, int idx){
        // base case
        if (idx==arr.length){
            return false;
        }
        // self work
        if (arr[idx]==target) return true;

        // recursion
        return linersearch(arr,target,idx+1);

    }
    static int linersearchfindindex( int arr[], int target, int idx){
        // base case
        if (idx==arr.length){
            return -1;
        }
        // self work
        if (arr[idx]==target) return idx;

        // recursion
        return linersearchfindindex(arr,target,idx+1);


    }

    static void  findallindex(int arr[], int target , int idx){
        if (idx==arr.length)return;

        if (arr[idx]==target){
            System.out.println(idx);
        }
        findallindex(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];



        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
    }
        System.out.println("enter number which you are serch");
        int target = sc.nextInt();
        int idx=0;
        System.out.println(linersearch(arr,target,idx));
        System.out.println(linersearchfindindex(arr,target,idx));
        findallindex(arr,target,idx);
}
}