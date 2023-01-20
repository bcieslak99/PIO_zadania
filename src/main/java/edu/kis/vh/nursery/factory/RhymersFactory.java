package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCounterOutRhymer;

public interface RhymersFactory {

	public DefaultCounterOutRhymer getStandardRhymer();

	public DefaultCounterOutRhymer getFalseRhymer();

	public DefaultCounterOutRhymer getFIFORhymer();

	public DefaultCounterOutRhymer getHanoiRhymer();

}
