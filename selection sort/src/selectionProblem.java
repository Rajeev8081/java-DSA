import java.util.Scanner;

public class selectionProblem {
    static void printarray(String []arr){
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void selectionproblem(String arr[]){
        for (int i=0;i<arr.length-1;i++){
            int min_index = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min_index].compareTo(arr[j])>0){
                   min_index=j;
                }
            }
            // swaping
            String temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      int ng =Integer.parseInt(sc.nextLine());
        String arr[]=new String[ng];
        System.out.println("enter unsorted array");
        for (int i=0 ;i<arr.length;i++){
            arr[i] =sc.nextLine();
        }
        selectionproblem(arr);
        printarray(arr);
    }
}
