// Name: Ahmet Harun Ertürk
//Matrikelnummer: 5127661

public class FinanzManager {

    public static void main(String[] args) {

        Konto myKonto = new Konto("Ahmet Harun Ertürk", "27645234", "220630831");
        Konto Mustermann = new Konto("Max Mustermann", "12345678", "1686438091");
        Konto Musterfrau = new Konto("Erika Musterfrau", "27645762", "2063081875");
        Konto Bauer = new Konto("Peter Bauer", "54379823", "9577086413");


        Mustermann.zeigeNameDesKontoinhabers();
        Mustermann.zeigeKontonummer();
        Mustermann.zeigeBlz();
        Mustermann.zeigeGuthaben();
        Mustermann.zeigeIBAN();


        Mustermann.zeigeKontoGesamtUebersicht();
        Mustermann.zeigeAktuellenKontoStand();

        Mustermann.berechneZinsen(12);
        Musterfrau.berechneZinsen(130);

        Mustermann.ueberweisungTaetigen(50,Musterfrau);
        Mustermann.zeigeAktuellenKontoStand();
        Musterfrau.zeigeAktuellenKontoStand();
        Musterfrau.ueberweisungTaetigen(-50,Bauer);

    }
}