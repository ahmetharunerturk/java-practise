import java.util.Scanner;

public class boyOlcum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();
        scanner.close();
        if (boy<=175)
        {
            System.out.print("KISA BOYLUSUNUZ");
            return;
        }
        else {
            System.out.print("UZUN BOYLUSUNUZ");
        }
    }
}
