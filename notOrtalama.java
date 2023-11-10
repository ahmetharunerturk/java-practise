import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int notSayisi = 0;

        System.out.println("Öğrenci notlarını girin (Negatif bir sayı girerek programı sonlandırabilirsiniz):");

        while (true) {
            int not = scanner.nextInt();
            if (not < 0) {
                break;
            }

            toplam += not;
            notSayisi++;
        }

        if (notSayisi > 0) {
            double ortalama = (double) toplam / notSayisi;
            System.out.println("Girilen notların ortalaması: " + ortalama);
        } else {
            System.out.println("Hiç not girilmedi.");
        }

        scanner.close();
    }




    }
