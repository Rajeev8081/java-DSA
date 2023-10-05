import java.util.Scanner;
public class changeArray {

    static  void printarray(int[]  arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void cnangeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
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
            cnangeArray(arr);
            printarray(arr);
        }


    }






