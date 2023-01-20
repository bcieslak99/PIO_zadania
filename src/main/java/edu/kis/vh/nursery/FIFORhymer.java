package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temporaryCounterOut = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temporaryCounterOut.countIn(super.countOut());
		
		int ret = temporaryCounterOut.countOut();
		
		while (!temporaryCounterOut.callCheck())
			
		countIn(temporaryCounterOut.countOut());
		
		return ret;
	}
}
