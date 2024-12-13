class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */

        Train italo = new Train();
        italo.build(10, 4, 6);
        italo.reserveFirstClassSeats(4);
        italo.reserveSecondClassSeats(6);

        System.out.println("Italo's occupancy ratio: " + italo.getTotOccupancyRatio() + "%");
        System.out.println("Italo's first class occupancy ratio: " + italo.getFirstClassOccupancyRatio() + "%");
        System.out.println("Italo's second class occupancy ratio: " + italo.getSecondClassOccupancyRatio() + "%\n");

        italo.deleteAllReservations();

        italo.reserveFirstClassSeats(2);
        italo.reserveSecondClassSeats(3);

        System.out.println("Italo's occupancy ratio: " + italo.getTotOccupancyRatio() + "%");
        System.out.println("Italo's first class occupancy ratio: " + italo.getFirstClassOccupancyRatio() + "%");
        System.out.println("Italo's second class occupancy ratio: " + italo.getSecondClassOccupancyRatio() + "%\n");
    }
}