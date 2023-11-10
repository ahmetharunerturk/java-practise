public class Konto {
    private final String nameDesKontoinhabers;
    private final String kontonummer;
    private final String blz;
    private float guthaben = 50;
    private String iban;

    public Konto(String nameDesKontoinhabers, String blz, String kontonummer) {
        this.nameDesKontoinhabers = nameDesKontoinhabers;
        this.kontonummer = kontonummer;
        this.blz = blz;

        generateIBAN();
        System.out.println(
                "Vielen Dank das Sie sich für die Bank " + blz + " entschieden haben.\n" +
                        "Ihnen wurde für dieses Konto die IBAN: " + iban + " zugewiesen.\n" +
                        "Als Dank erhalten Sie ein Startguthaben von 50€!"
        );
    }

    private void generateIBAN(){
        String kuerzel = "DE99";

        this.iban = kuerzel + "-" + blz + "-" + kontonummer;
    }

    public void berechneZinsen(float zinssatz){
        if(zinssatz > 100f){
            System.out.println("Es tut uns Leid, aber wir bieten nur einen Zinssatz von maximal 100% an.");
        } else if(zinssatz < 0){
            System.out.println("Es tun uns Leid, aber wir können keinen negativen Zinssatz anbieten.");
        } else {
            System.out.println("Mit einem Zinssatz von " + zinssatz + "%, würden Sie nach einem Jahr " + ((guthaben * zinssatz) / 100f) + "€ an Zinsen erhalten");
        }
    }

    public void ueberweisungTaetigen(float betrag, Konto empfaenger){
        if(betrag <= 0){
            System.out.println("Sie können keinen negativen oder leeren Betrag überweisen!");
            return;
        }

        this.guthaben -= betrag;
        empfaenger.guthaben += betrag;

        System.out.println("Die Transaktion wurde erfolgreich ausgeführt.");
    }

    //region Wert-Anzeige

    public void zeigeAktuellenKontoStand() {
        System.out.println(nameDesKontoinhabers + " (IBAN: " + iban + ") verfügt über ein Kontoguthaben von: " + guthaben + "€.");
    }

    public void zeigeNameDesKontoinhabers() {
        System.out.println("Kontoinhaber: " + nameDesKontoinhabers);
    }

    public void zeigeKontonummer() {
        System.out.println("Kontonummer: " + kontonummer);
    }

    public void zeigeBlz() {
        System.out.println("BLZ: " + blz);
    }

    public void zeigeGuthaben() {
        System.out.println("Guthaben: " + guthaben);
    }

    public void zeigeIBAN() {
        System.out.println("IBAN: " + iban);
    }

    public void zeigeKontoGesamtUebersicht(){
        System.out.println("Das sind Ihre aktuellen Kontodaten:");
        zeigeNameDesKontoinhabers();
        zeigeKontonummer();
        zeigeBlz();
        zeigeGuthaben();
        zeigeIBAN();
    }

    //endregion


}
