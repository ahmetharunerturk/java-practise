import java.util.Random;

public class BankAccount {
    private final String accountNumber;
    private final String blz = "95032016";
    private float credit = 50;
    private String iban;

    public BankAccount() {
        Random rand = new Random();
        StringBuilder accountNumber = new StringBuilder();

        for (int i = 0; i < 9; i++)
            accountNumber.append(rand.nextInt(10));

        this.accountNumber = accountNumber.toString();

        generateIBAN();
        System.out.printf("""
            Vielen Dank das Sie sich für die Bank %s entschieden haben.
            Ihnen wurde für dieses Konto die IBAN: %s zugewiesen.
            Als Dank erhalten Sie ein Startguthaben von 50€!
            """, blz, iban);
    }

    private void generateIBAN(){
        String shortage = "DE99";

        this.iban = shortage + "-" + blz + "-" + accountNumber;
    }

    public void calculateInterestCharge(float interestRate){
        if(interestRate > 100f){
            System.out.println("Es tut uns Leid, aber wir bieten nur einen Zinssatz von maximal 100% an.");
        } else if(interestRate < 0){
            System.out.println("Es tun uns Leid, aber wir können keinen negativen Zinssatz anbieten.");
        } else {
            System.out.println("Mit einem Zinsatz von " + interestRate + "%, würden Sie nach einem Jahr " + ((credit * interestRate) / 100f) + "€ an Zinsen erhalten");
        }
    }

    public void transferMoney(float amount, BankAccount reciever){
        if(amount <= 0){
            System.out.println("Sie können keinen negativen oder leeren Betrag überweisen!");
            return;
        }

        this.credit -= amount;
        reciever.credit += amount;

        System.out.println("Die Transaktion wurde erfolgreich ausgefuehrt.");
    }


    public void printAccountStatus() {
        System.out.println("Das Konto mit der IBAN " + iban + " verfügt über ein Kontoguthaben von: " + credit + "€.");
    }

    public void printAccountNumber() {
        System.out.println("Kontonummer: " + accountNumber);
    }

    public void printBlz() {
        System.out.println("BLZ: " + blz);
    }

    public void printCredit() {
        System.out.println("Guthaben: " + credit);
    }

    public void printIBAN() {
        System.out.println("IBAN: " + iban);
    }

    public void printAccountOverview(){
        System.out.println("Das sind Ihre aktuellen Kontodaten:");
        printAccountNumber();
        printBlz();
        printCredit();
        printIBAN();
        System.out.println();
    }

    //endregion


}
