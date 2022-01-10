package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY = -1;
    public static final int SIZE = 12;
    public static final int FULL = 11;

    public int total = EMPTY;
    private final int[] numbers = new int[SIZE];

    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
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
