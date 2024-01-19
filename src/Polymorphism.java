package src;

public class Polymorphism {

    static int add(int val1, int val2) {
        return val1 + val2;
    }

    static int add(int val1, int val2, int val3) {
        return val1 + val2 + val3;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 3));
        System.out.println(add(1, 4, 5));
    }
}
