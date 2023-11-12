import java.util.Scanner;
public class maiLDiv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mail adresinizi girin: ");
        String mail = scanner.next();
        scanner.close();


        String ifade = "@";

        int index = mail.indexOf(ifade);



        if (index != -1) {

            String parcalananString = mail.substring(0,index);


            System.out.println("Parçalanan String: " + parcalananString);
        } else {
            System.out.println("İfade bulunamadı.");
        }
    }
}
