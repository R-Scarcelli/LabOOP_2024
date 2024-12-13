class CallByValue {

    void increment(int a) {
        a++;
    }

    public static void main(final String[] args) {
        int x = 1;
        CallByValue cbv = new CallByValue();
        cbv.increment(x);
        System.out.println("x=" + x); // x is not 2 because the increment of the x value is local only to the metod
                                      // increment so the actual value of x is not changed
    }
}
