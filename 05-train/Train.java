class Train{
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats) {
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
    }

    void reserveFirstClassSeats(int nToReserveFirstClass) {
        this.nFirstClassReservedSeats = nToReserveFirstClass;
    }

    void reserveSecondClassSeats(int nToReserveSecondClass) {
        this.nSecondClassReservedSeats = nToReserveSecondClass;
    }

    double getTotOccupancyRatio() {
        return (double)(((double)(this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / (double)this.nTotSeats) * 100);
    }

    double getFirstClassOccupancyRatio() {
        return (double)(((double)this.nFirstClassReservedSeats / (double)this.nFirstClassSeats) * 100);
    }

    double getSecondClassOccupancyRatio() {
        return (double)(((double)this.nSecondClassReservedSeats / (double)this.nSecondClassSeats) * 100);
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}