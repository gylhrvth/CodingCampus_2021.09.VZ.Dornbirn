package Mahir;

public class Tag5 {
    public static void main(String[] args) {

        printtriangle(20);
        System.out.println();


    }


    public static void printstar() {

        for (int a = 0; a <= 10; a++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printtriangle(int height){
        int a = height ;
        for (int x = 0; x < height; x++){
            repeat(x,"=>");
        }
        for (int y = height; height > 0; height--){
            repeat(height,"=>");
        }




    }
    public static  void repeat(int times, String charakter){
        for(int a = 0; a < times; a++){
            System.out.print(charakter);
        }
        System.out.println();
    }

}
