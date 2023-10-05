import java.sql.SQLOutput;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       /// wrapped classes
//        Integer in =Integer.valueOf(8);
//        System.out.println(in);
//        Float f = Float.valueOf(5.23f);
//        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> l2 = new ArrayList<>();

        // adda new element
        l1.add(9);  //9
        l1.add(2);  //9,2
        l1.add(3);  //9,2,3
        l1.add(1);
        l1.add(5);

        //ger ana element at index
        System.out.println(l1.get(0)); //9

        //print with loop
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));//9,2,3,1,5
        }

        //print the array directly
        System.out.println(l1); //[9,2,3,1,5]

        //adding element at some index i // 9,2,100,3,1,5
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(2,8);
        System.out.println(l1);

        //remove element at index i
        l1.remove(3);
        System.out.println(l1);

        //removing element e . index not know
        System.out.println(l1.remove(Integer.valueOf(1)));
        System.out.println(l1);

        //check element exists
        System.out.println(l1.contains(Integer.valueOf(54)));

        //if you don't specify class , so you can put anything inside l

        ArrayList l= new ArrayList();
        l.add("rajeev");
        l.add(3);
        l.add(3.4);
        System.out.println(l);


    }
}