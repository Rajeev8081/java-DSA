import java.util.ArrayList;

public class Returnsubsequenceofarraylist {
    static ArrayList<String> subsequence( String s ){
        ArrayList<String> answer = new ArrayList<>();
        // base work
        if (s.length()==0){
           answer.add("");
           return answer;
        }
        char current = s.charAt(0);
        //recursion
        ArrayList<String> recur = subsequence(s.substring(1));

      // small ans =[bc, b , c , '']
        // ans = [bc,abc,b,ab,c,ac,'',a ]
        for (String ss:recur) {
            answer.add(ss);
            answer.add(current + ss);
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayList<String> an =subsequence("abc");
        for (String result:an) {
            System.out.println(result);
        }
    }
}
