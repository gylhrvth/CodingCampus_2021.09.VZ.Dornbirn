package Gyula;

public class VariableLifeCycle {
    public static int globalA = 5;

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        if (a > 10){
            int b = -3;
            System.out.println(b);
        }
        //System.out.println(b);
        function2(a);
        System.out.println(a);

        int[] aInArray = {5};
        function2WithArray(aInArray);
        System.out.println(aInArray[0]);
        System.out.println(globalA);
    }

    public static void function2(int parameter) {
        System.out.println(parameter);
        parameter += 10;
        globalA += 10;
    }

    public static void function2WithArray(int[] parameter){
        System.out.println(parameter[0]);
        parameter[0] += 10;
        globalA += 10;
    }
}
