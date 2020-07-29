package com.nintyone.social.javaclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.nintyone.social.configurations.CycleConfigurations;
import com.nintyone.social.interfaces.Calculator;

public class TestingClass {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalculatePrice() {
		
		Calculator cycleCalculator = new CyclePriceCalculator();
		CycleConfigurations cycleConfigurations = new CycleConfigurations();
		cycleConfigurations.setFrameType(1);
		cycleConfigurations.setTubetype(1);
		cycleConfigurations.setNoOfGears(1);

		int totalPrice = cycleCalculator.calculatePrice(cycleConfigurations);
		assertEquals(1450, totalPrice);

		}

}
