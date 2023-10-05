import java.util.ArrayList;
import java.util.Collections;

public class reverseArraylist {
    static void reverselist(ArrayList<Integer>list){
        int i =0 ,j=list.size()-1;

        while (i<j){
//            int temp =a;
//            a=b;
//            b=temp;
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(24);
        list.add(43);
        System.out.println("original list"+list);
//        reverselist(list);
        Collections.reverse(list);
        System.out.println("reverse list"+list);
        Collections.sort(list);
        System.out.println("ascending order"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("desc"+list);

        


    }
}
