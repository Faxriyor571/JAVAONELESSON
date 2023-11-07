import java.sql.SQLOutput;
import java.util.Scanner;

public class lessonnineBolishqoldq {
    public static void main(String[] args) {
        Scanner klaviyatura = new Scanner(System.in);
        int raqam, qoldiq;
        System.out.println("Son kiriting: ");
        raqam = klaviyatura.nextInt();
        qoldiq = raqam % 2;
        if (qoldiq == 0)  {
            System.out.println(raqam+ " juft son");
        } else {
            System.out.println(raqam+" toq son");
        }
    }

}
