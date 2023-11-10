import java.util.Scanner;

public class OgrenciSoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2+2=? ");
        double cevap = scanner.nextDouble();

        if (cevap == 4) {
            System.out.print("Doğru cevap!");
            scanner.close();
            return;
        } else {
            System.out.println("Yanlış cevap!");

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("son hakkınız: 2+2=? ");
            double cevap2 = scanner2.nextDouble();
            scanner2.close();

            if (cevap2 == 4) {
                System.out.print("Doğru cevap!");
            } else {
                System.out.print("Yanlış cevap!");
            }
        }
    }
}
