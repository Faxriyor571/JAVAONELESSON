class operatsion {
    int square(int n){
        return n*n;
    }
}

class Circle {
    operatsion op;
    double pi=3.14;
    double agre(int r) {
        op = new operatsion();
        int resquare = op.square(r);
   return pi*resquare;
    }
}

public class aggrecation {
    public static void main(String[] args) {
       Circle c = new Circle();
       double result = c.agre(5);
        System.out.println(result);

    }
}
