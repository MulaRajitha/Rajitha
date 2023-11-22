package com.cg.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	MinMaxFinder mmf=new MinMaxFinder();

	@Test
	void findminmax() {
		int[] e1= {56,34,7,3,54,3,34,34,53};
		int[] e2= {54,87,984,243,2,657};
		int[] e3= {42,45,7,5,76,23};
		int[] a1= {3,56};
		int[] a2= {2,984};
		int[] a3= {5,76};
		assertAll(()->assertArrayEquals(a1,mmf.findMinMax(e1)),
				  ()->assertArrayEquals(a2,mmf.findMinMax(e2)),
				  ()->assertArrayEquals(a3,mmf.findMinMax(e3)));
	}

}
