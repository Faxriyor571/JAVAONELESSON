import java.util.Scanner;
public class tub {
    public static void main(String[] args) {
        Scanner c1 = new Scanner(System.in);
        System.out.print("kiriting: ");
        int son = c1.nextInt();
        boolean tubmi;
        for (int i = 2; i <=son; i++) {
            tubmi = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    tubmi = false;
                    break;
                }
            }
            if (tubmi) {
                System.out.print("tub "+i);
            }
        }

    }
}
