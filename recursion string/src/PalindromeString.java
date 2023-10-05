import java.util.Scanner;

public class PalindromeString {
    static String reversestring2(String s){
        if (s.length()==0) return "";
        //recursion
        String recur = reversestring2(s.substring(1));
        //self work
        return recur + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       String ans =reversestring2(s);
       if (ans.equals(s) ){
           System.out.printf("%s is a palindrome",s);

       }else {
           System.out.printf("%s is a not palindrome",s);
       }

    }
}
