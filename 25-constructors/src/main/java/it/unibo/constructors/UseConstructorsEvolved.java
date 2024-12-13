package it.unibo.constructors;

class UseConstructorsEvolved {
    static final int DEFAULT_N_FC_SEATS = 50;
    static final int DEFAULT_N_SC_SEATS = 100;
    static final int DEFAULT_TOT_SEATS = 150;

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).
        final Train defaultTrain = new Train();
        defaultTrain.printTrainInfo();
        System.out.println("Tutto ok? " + (defaultTrain.firstClassSeats == DEFAULT_N_FC_SEATS) + "e "
                + (defaultTrain.secondClassSeats == DEFAULT_N_SC_SEATS));
        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
        final Train italo = new Train(20, 200);
        italo.printTrainInfo();
        final Train frecciaRossa = new Train(35, 165);
        frecciaRossa.printTrainInfo();
    }
}
