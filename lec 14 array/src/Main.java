import java.util.Scanner;

class arrayquestion{
//    void maxArray(){
//        int[] aar={1,3,10,7,5,8,9};
//        int ans=0;
//        for (int i=0;i<aar.length;i++){
//            if (aar[i]>ans){
//                ans=aar[i];
//            }else {
//            }
//
//            }
//        System.out.println(ans);

//        }

void arraypresent(){
    int[] aar={1,3,10,7,3,5,8,9};
    int x=3;
    int ans=-1;
    for (int i=0;i<aar.length;i++){
        if (aar[i]==x){
            ans=i;
            break;
        }
    }
   if (ans==-1){
       System.out.println("not found");
   }else {
    System.out.println("found "+x+" in index "+ans);
}}

    }

public class Main {
    public static void main(String[] args) {
    arrayquestion obj = new arrayquestion();
//    obj.maxArray();
        obj.arraypresent();


    }
}

