import java.util.Scanner;

public class Main {
    static void printincrease(int n){
        if (n==1){
            System.out.println(n);
            return;
        }

        printincrease(n-1); // 1,2,3,....n-1;
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printincrease(n);
    }
}