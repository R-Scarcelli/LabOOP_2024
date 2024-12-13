class Calculator{
    int nOpDone;
    double lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;
    }

    double add(double a , double b) {
        this.lastRes = a + b;
        this.nOpDone++;
        return (a + b);
    }

    double sub(double a , double b) {
        this.lastRes = a - b;
        this.nOpDone++;
        return(a - b);
    }

    double mul(double a , double b) {
        this.lastRes = a * b;
        this.nOpDone++;
        return (a * b);
    }

    double div(double a , double b) {
        if(b != 0){
            this.lastRes = a / b;
            this.nOpDone++;
            return (a / b);
        }
        else {
            System.out.println("Error you can't divide a number by 0 (this error will return 1)");
            return 1;
        }
    }
}