import java.util.Scanner;

public class factorial {
    static int Factorial(int n){
        if (n==0)return 1;

        int sumans = Factorial(n-1);

        int ans= n*sumans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=Factorial(n);
        System.out.println(ans);
    }
}
