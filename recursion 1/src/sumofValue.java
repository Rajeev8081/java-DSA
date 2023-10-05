import java.util.Scanner;

public class sumofValue {
    static int sumofvalue(int n){
        if (n==0){
            return 0 ;
        }
        //recursion
        int recur =sumofvalue(n-1);
        return recur + n;
    }
    static int sumofvalueAlternate(int n){
        if (n==0){
            return 0;
        }
        // recur
        int recur  ;

        if (n%2==0){
            return sumofvalueAlternate(n-1)-n;

        }else{
            return sumofvalueAlternate(n-1)+n;


        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        System.out.println(sumofvalue(n));
        System.out.println(sumofvalueAlternate(n));
    }
}
