package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) totalRejected++;
        else super.countIn(in);
    }
}

//'if' oraz 'else' nie są w jednej linii
//'if' można zapisać w jednej linii
//'else' można zapisać w jednej linii
//'brak wcięcia pzy zmiennej 'totalRejected'

//'alt + <- lub alt + -> pozwala przełączać się między otwartymi plikami w projekcie