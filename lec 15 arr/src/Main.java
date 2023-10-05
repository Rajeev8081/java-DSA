import java.util.Arrays;
import java.util.Scanner;
public class Main {

    static  void printarray(int[]  arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter no");
     int n = sc.nextInt();
     int[] arr = new  int[n];


     System.out.println("enter "+n+" elements");
     for (int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     System.out.println("original array");
    printarray(arr);

        System.out.println("copied array");

        //due to clone array original are not change
//  int[] arr2= arr.clone();


 //array.copyof is another method to edit copid array without any change in original array
        //two parameter pass one is which array copid and second is how many length are print
//        int[] arr2= Arrays.copyOf(arr,arr.length);

        //third one is Arrays.copyOfRange in first parameter is which array and second is kha se suru karna hai and last is kaha tak jana hai
        int[] arr2= Arrays.copyOfRange(arr,3,arr.length  );
  printarray(arr2);
// changing some value in arr2
        arr2[0]=2;
        arr2[2]=2;
        System.out.println("original arr after changing arr2");
        printarray(arr);
        System.out.println("copied arr after changing arr2");
        printarray(arr2);

        //chnage array

    }
}