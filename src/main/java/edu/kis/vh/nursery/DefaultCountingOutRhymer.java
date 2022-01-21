package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1; //add final
    private static final int NEGATIVE_TOTAL = -1; //add final
    private static final int SIZE = 12;//add final
    private static final int FULL = 11;//add final

    private int total = NEGATIVE_TOTAL;
    private final int[] numbers = new int[SIZE];//add final

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_TOTAL;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck()) return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) return EMPTY;
        return numbers[total--];
    }

}
