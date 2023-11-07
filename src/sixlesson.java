import java.util.Scanner;
public class sixlesson {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        int raqam1,raqam2,nimaqlmoqchisz,yigindi;
        System.out.print("Birinchi sonni kiriting: ");
        raqam1 = kiritilgan.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        raqam2 = kiritilgan.nextInt();
        System.out.print("nima qilmoqchisz: ");
        nimaqlmoqchisz = kiritilgan.nextInt();
        if (nimaqlmoqchisz == 1) {
            yigindi = raqam1+raqam2;
            System.out.println("qo'shish amalini bajardingiz: "+yigindi);
    }else if (nimaqlmoqchisz == 2) {
            yigindi = raqam1*raqam2;
            System.out.println("ko'paytirishni bajardingiz: "+yigindi);
        }else if (nimaqlmoqchisz == 3) {
            yigindi = raqam1/raqam2;
            System.out.println("bo'lish ni bajardingiz: "+yigindi);
        }else if (nimaqlmoqchisz ==4) {
            yigindi = raqam1-raqam2;
            System.out.println("ayrishni bajardiongiz: "+yigindi);
        }
}}
