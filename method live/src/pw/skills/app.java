package pw.skills;

public class app {

      public String str_1  ="i am string";
    void  printfromclass(){
        System.out.println("within the "+str_1);
    }

    public static void main(String[] args) {
    app obj = new app();
    obj.printfromclass();
    System.out.println("within the " + obj.str_1);
    app2 obj2 = new app2();
    obj2.prinoutsideclass();


    }
}
class app2{
     void prinoutsideclass(){
         app obj = new app();

         System.out.println("within package outside the class "+obj.str_1);


     }
}