import java.util.Scanner;

public class basitHesap {
    public static void main(String[] args) {

        Scanner sayiScann = new Scanner(System.in);

        System.out.println("1. sayıyı girin: ");
        int sayi1 = sayiScann.nextInt();

        System.out.println("2. sayıyı girin: ");
        int sayi2 = sayiScann.nextInt();

        System.out.println("Toplama: " +(sayi1+sayi2));
        System.out.println("Çıkarma: " +(sayi1-sayi2));
        System.out.println("Çarpma: " +(sayi1*sayi2));
        System.out.println("Bölme: " +(sayi1/sayi2));
        System.out.println("Mod: " +(sayi1%sayi2));




    }
}
