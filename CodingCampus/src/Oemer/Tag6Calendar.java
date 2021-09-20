package Oemer;

public class Tag6Calendar {

    public static void  printNumber (int i) {
        if(i>0){
            if (i<10) {
                System.out.print("| " + i + "  ");
            }else if(i <10) {
                System.out.print("| "+i+" ");
            }else{
                System.out.print("|    ");
            }
        }
    }
    public static void checkLineEnd(int i ){
        if(i%7==0){
            System.out.print("|");
        }
    }




}
