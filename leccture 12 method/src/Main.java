import java.util.Scanner;

class  algebra{
int a ;
int b ;

    algebra(int x , int y){
      System.out.println("hii constructor");
      a=x;
      b=y;
    }
    int add (){
     int ans =  a+b;
     return  ans;
    }

    int sub (){
        return  a-b;
    }
    int mul (){
        return  a*b;
    }
}
public class Main {
    public static void main(String[] args) {
algebra obj = new algebra(5,6);
        Scanner sc =new Scanner(System.in);
//        int a =sc.nextInt();
//        int b =sc.nextInt();
        System.out.println("sum of input number is");
         int result = obj.add();
         System.out.println(result);
         System.out.println(obj.sub());
         System.out.println(obj.mul());
//         another constructor call
algebra obj2=new algebra(3 ,8);
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.add());

//        System.out.println(Math.sqrt(22));
//        System.out.println(Math.max(44,22));
//        System.out.println(Math.floor(2.2));
//        System.out.println(Math.ceil(2.2));
//        System.out.println(Math.sqrt(42));

          }
}