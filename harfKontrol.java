import java.util.Scanner;

public class harfKontrol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char girilenKarakter = scanner.next().charAt(0);


        if (Character.isLowerCase(girilenKarakter)) {

            char buyukHarf = Character.toUpperCase(girilenKarakter);
            System.out.println(girilenKarakter + " küçük bir harftir. Büyük harfi: " + buyukHarf);
        } else {
            System.out.println(girilenKarakter + " küçük bir harf değildir.");
        }


        scanner.close();
    }
}
