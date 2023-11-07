import java.util.Scanner;
public class whilesikli {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        int natija = 0, son = 1;
        System.out.println("son");
        int raqam = kiritilgan.nextInt();
        while (son <= raqam) {
            natija += son++;
        }
        System.out.println(natija);
    }
}