package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder andreaRossiAccount = new AccountHolder("Andrea", "Rossi", 1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder alexBianchiAccount = new AccountHolder("Alex", "Bianchi", 2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount andreaRossi = new SimpleBankAccount(1, 0);
        SimpleBankAccount alexBianchi = new SimpleBankAccount(2, 0);
        // 4) Effettuare una serie di depositi e prelievi
        andreaRossi.deposit(1, 2000);
        andreaRossi.depositFromATM(1, 20);
        andreaRossi.withdraw(1, 1000);
        alexBianchi.withdrawFromATM(2, 20);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(andreaRossiAccount.toString());
        System.out.println(andreaRossi.toString());
        System.out.println(alexBianchiAccount.toString());
        System.out.println(alexBianchi.toString());
        // 6) Provare a prelevare fornendo un id utente sbagliato
        alexBianchi.withdraw(1, 100);
        // 7) Controllare nuovamente l'ammontare
        System.out.println(andreaRossi.toString());
        System.out.println(alexBianchi.toString());
    }
}
