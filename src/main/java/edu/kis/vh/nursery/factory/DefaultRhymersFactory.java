package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCounterOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCounterOutRhymer getStandardRhymer() {
		return new DefaultCounterOutRhymer();
	}

	@Override
	public DefaultCounterOutRhymer getFalseRhymer() {
		return new DefaultCounterOutRhymer();
	}

	@Override
	public DefaultCounterOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCounterOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
