package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCounterOutRhymer {

	int totalRejected = 0;

	public int getReportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

//Błędy formatowania pojawiają się w wierszach 5, 12, 14 i 15
}
