package Ingo.week7.home;

public class MethodeVoidAndReturn {
    public static void main(String[] args) {
        System.out.println(add(8,7));
        add1();
    }
    public static int add(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static void add1() {
        int a = 8;
        int b = 7;
        int sum = a + b;
        System.out.println(sum);
    }
}
