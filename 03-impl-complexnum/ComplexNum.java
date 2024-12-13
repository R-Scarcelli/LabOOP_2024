class ComplexNum {
    /*
     * Inserire qui la dichiarazione dei campi della classe
     */
    double re;
    double im;

    void build(double re, double im) {
        /*
         * Inserire qui l'inizializzazione dei campi con i parametri forniti in input
         */
        this.re=re;
        this.im=im;
    }

    boolean equal(ComplexNum num) {
        /*
         * Implementare il metodo in modo che restituisca true se e solo se il
         * numero complesso è uguale al parametro num passato in input
         */
        if(this.re == num.re && this.im == num.im)
        {
            return true;
        } 
        return false;
        /*conreollare se posso fare return (this.re == num.re && this.im == num.im)*/
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione
         * testuale del numero complesso
         */
        if (this.im==1) return this.re + "i";
        if(this.im == 0) return "" + this.re;
        return this.im < 0 ?
        this.re + "" + this.im + "i" : this.re + "+" + this.im + "i";
    }
}