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
    public static void drawCalender(int amountofDays,int offset){
        for (int i=1; i<=amountofDays+offset;i++){
            printNumber(i-offset);
            checkLineEnd(i);
        }

        int missing= 7-(amountofDays+offset)%7;
         for (int i =0;i<missing;i++){
             System.out.println("|   ");
         }




    }










}
