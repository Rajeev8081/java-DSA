import java.util.Scanner;

public class sumofnumber {
    static int Sumofnumber(int n){
       if (n>=0&& n<=9)
           return n;
       int recur = Sumofnumber(n/10);
       int ans= n%10 + recur;
       return ans;

    }

    //count of digit

    static int countnumber (int n){
        if(n>=0 && n<=9)
            return 1;
        int recur =0;
          recur = countnumber(n/10);
//
        int ans= 1 +recur;
////
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(Sumofnumber(n));
        System.out.println(countnumber(n));

    }
}
