class adder {
    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }

    static double add(double a, double b) {
        return a+b;
    }
}
public class polymorhism {
    public static void main(String[] args) {
        adder a1 = new adder();
        System.out.println(a1.add(12, 13));
        System.out.println(a1.add(15, 16));
        System.out.println(a1.add(11.2,11.1));
    }
}
