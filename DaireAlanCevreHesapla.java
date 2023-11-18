import java.util.Scanner;

public class DaireAlanCevreHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();
        scanner.close();

        double alan = Math.PI * yaricap * yaricap;
        double cevre = 2 * Math.PI * yaricap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        //deneme
    }
}
