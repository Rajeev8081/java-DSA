import java.util.Scanner;

 class FirstElementRepeting {

    static int firstelementreapeting(int arr[]){
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    ans= arr[i];
                    return ans;
                }
            }
        }
        return ans;
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
       System.out.println("first match number is "+firstelementreapeting(arr));
    }
}
