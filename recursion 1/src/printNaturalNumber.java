import java.util.Scanner;

public class printNaturalNumber {
    static void printNaturalNo(int n){
        if(n==1){
System.out.println(1);
return;
        }
        System.out.println(n);
        printNaturalNo(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNaturalNo(n);
    }
}
