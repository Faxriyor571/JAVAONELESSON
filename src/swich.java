import java.util.Scanner;

public class swich {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        int yosh;
        System.out.print("Farzandingiz yoshini kiriting: ");
        yosh = kiritilgan.nextInt();
        switch (yosh) {
            case 1:
                System.out.println("u hali go'dak");
                break;
            case 2:
                System.out.println("sut yoshida");
                break;
            case 3:
                System.out.println("endi yurab boshlagan");
                break;
            default:
                System.out.println("sz kitirgan yosh kiritilmagan");
                break;
        }
    }
}
