public class TekToplam {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 1; i <= 999; i++) {
            if (i % 2 != 0) { // Eğer i tek sayı ise
                toplam += i; // Tek sayıları toplama ekle
            }
        }

        System.out.println("1'den 999'a kadar olan tüm tek tamsayıların toplamı: " + toplam);
        //commit deneme2
    }
}