import java.util.Scanner;

public class GCD {
    //iterative form

    static  int  iterativeGCD(int x , int y){
        while ( x%y != 0){
            int rem = x%y;
            x=y;
            y = rem;
        }
        return y;
    }
    // In recursion method

    static int gcd(int x , int y){
        if (y==0 ){
            return x ;
        }
        //recursion
        int ans = gcd(y,x%y);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(iterativeGCD(x,y));
        System.out.println(gcd(x,y));
    }
}
