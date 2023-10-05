import java.util.Scanner;

public class fibonacci {
    static  int Fibonacci(int n){
        if (n==0 || n==1){
            return  n;
        }
        int pre = Fibonacci(n-1);
        int prepre = Fibonacci(n-2);

        return  pre + prepre;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(Fibonacci(i));

        }



    }
}
