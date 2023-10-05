import pw.skills.app;
public class outsidepwskill {



   public static void main(String[] args) {
      app obj = new app();
      app3 obj3 =new app3();
      obj3.printfromchidclass();

      System.out.println("outside package "+ obj.str_1);
   }
}
class app3 extends app{
   void  printfromchidclass(){
      app3 obj3 =new app3();

      System.out.println("child class "+ obj3.str_1);
   }
}