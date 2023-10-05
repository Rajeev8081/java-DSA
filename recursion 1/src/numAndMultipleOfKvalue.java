import java.util.Scanner;

public class numAndMultipleOfKvalue {
    static void multipleofk(int num , int k){
        if (k==1){
            System.out.println(num);
            return  ;
        }
        //recursion work
        multipleofk(num , k-1);
        //self work
      System.out.println(num * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int k = sc.nextInt();
    multipleofk(num,k);
    }
}
