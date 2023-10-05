import java.util.Scanner;
   public class  pairsumm{
     static int pairsum(int[]arr,int target){
         int n = arr.length;
         int answer=0;
         for (int i =0;i<n;i++) {
             for (int j = i + 1; j < n; j++) {
                 for (int k = j + 1; k < n; k++) {
                     if (arr[i] + arr[j] +arr[k]== target) {
                         answer++;
                     }
                 }
             }
         }
         return answer;
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
        System.out.println("enter target sum");
        int target = sc.nextInt();
         System.out.println(pairsum(arr,target));
    }
}
