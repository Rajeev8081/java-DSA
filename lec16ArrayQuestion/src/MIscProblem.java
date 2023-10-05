import java.util.Scanner;

public class MIscProblem {
//    another better approach of rotatearray

    static void rotatearray(int arr[],int k){
        int n = arr.length;
        k= k%n;
        reversearray(arr,0,n-k-1);
        reversearray(arr,n-k,n-1);
        reversearray(arr,0,n-1);

    }


    static  int[] rotateArray(int arr[],int k){
        int n = arr.length;
        k= k%n;
        int []ans=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr [i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
    }
      return ans;
    }

    static void printarray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    static int[] reveersenumber(int arr[]) {
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j = 0;
//        for (int i = n-1; i >= 0; i--) {
//            ans[j++] = arr[i];
//
//        }
//        return ans;

//    }
    static  void swaparray(int arr[],int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    another appraoch of reverse array and ths is better for before
static void reversearray(int arr[],int i ,int j){
//        int i=0;int j=arr.length-1;

        while(i<j){
            swaparray(arr,i,j);
            i++;
            j--;
        }
}

    static void swapTwoNumber(int a, int b) {

        int temp = a;

        System.out.println("value before swap");
        System.out.println("a " + a);
        System.out.println("b " + b);

        a = b;
        b = temp;
        System.out.println("value after swap");
        System.out.println("a " + a);
        System.out.println("b " + b);

    }

    public static void main(String[] args) {
//        int a =2;
//        int b=4;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
//    swapTwoNumber(a,b);
        }
        System.out.println("enter value of K");
        int k = sc.nextInt();

//        int[] ans = reveersenumber(arr);
//        printarray(ans);
//        System.out.println("reverse order array " +printarray(arr));
//        reversearray(arr);
//        printarray(arr);
//
//        int[] answer = rotateArray(arr ,k);
//        printarray(answer);



        rotatearray(arr,k);
        printarray(arr);
    }
}