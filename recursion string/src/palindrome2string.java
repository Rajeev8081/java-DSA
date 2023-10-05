import java.util.Scanner;

public class palindrome2string {
    static  boolean ispalindrome(String s , int l , int r){
        if (l>=r) return true;


         boolean ans =ispalindrome(s , l+1,r-1);

        return s.charAt(l)== s.charAt(r) && ans;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l=0;
        int r=s.length()-1;
        System.out.println(ispalindrome(s,l,r));
    }
}
