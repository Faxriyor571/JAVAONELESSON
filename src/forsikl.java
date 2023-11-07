import java.util.Scanner;
public class forsikl {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        int raqam;
        int javob=0;
        System.out.println("biror son kiriting: ");
        raqam = kiritilgan.nextInt();
        for (int son =1; son <= raqam ; son++) {
            javob +=son;
        }
        System.out.printf ("1 dan %d gacha sonlar yig'indisi: %d",raqam,javob);
    }
}
