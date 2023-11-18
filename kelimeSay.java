import java.util.Scanner;

public class kelimeSay {
    public static void main(String[] args) {
        Scanner strScann = new Scanner(System.in);

        System.out.println("Kelime girin: ");
        String kelime = strScann.next();

        System.out.println(kelime.length());
    }
}
