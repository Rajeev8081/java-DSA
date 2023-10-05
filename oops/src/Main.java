 class student {
    int rollNO;
    String studentname;
}
    public class Main {
        public static void main(String[] args) {
            student obj1 = new student();
            obj1.rollNO = 1;
            obj1.studentname = "rajeev";

            System.out.println(obj1.rollNO);
            System.out.println(obj1.studentname);

            student obj2 = new student();
            obj2.rollNO = 2;
            obj2.studentname = "chandan";
            System.out.println(obj2.rollNO);
            System.out.println(obj2.studentname);
        }
    }

