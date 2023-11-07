import java.util.Scanner;

public class newlesson{
    public static void main(String[] args) {
        Scanner malumot = new Scanner(System.in);
        int yosh;
        String ism;
        System.out.print("ismingizni kiriting: ");
        ism = malumot.nextLine();
        System.out.print("yoshingizni kiriting: ");
        yosh = malumot.nextInt();
        System.out.println("Sizning yoshingiz: "+yosh);
        System.out.println("Sizning ismingiz: "+ism);
    }
}