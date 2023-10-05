import java.util.Scanner;

public class reverseString {
    static String reversestring(String s,int idx){
        if (idx==s.length()) return "";
        //recursion
        String recur= reversestring(s,idx+1);
        //self work
        return recur + s.charAt(idx);
    }
    // second approach
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
        int idx =0;
        System.out.println(reversestring(s,idx));
        System.out.println(reversestring2(s));
    }
}
