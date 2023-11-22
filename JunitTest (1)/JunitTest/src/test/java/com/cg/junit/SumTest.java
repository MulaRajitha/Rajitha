package com.cg.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTest{
	Sum sc=new Sum();
	

	@Test
	void testExtractData() {
		Assertions.assertEquals("res", sc.extractData("stress"));
	}

}
