package com.nintyone.social.javaclasses;

import com.nintyone.social.configurations.CycleConfigurations;
import com.nintyone.social.configurations.PriceConfigurations;
import com.nintyone.social.interfaces.Calculator;

public class CyclePriceCalculator implements Calculator
{
    int totalPrice = 0;

    public int calculatePrice(CycleConfigurations cycleConfiguration)
    {
        totalPrice = (PriceConfigurations.rimPrice * 2);

        if (cycleConfiguration.frameType == 1)
        {
            totalPrice +=  PriceConfigurations.steelFramePrice;//SteelframePrice;
        }
        else
        {
            totalPrice += PriceConfigurations.normalFramePrice;
        }

        if (cycleConfiguration.tubetype == 1)
        {
            totalPrice += PriceConfigurations.tubeLesTyrePrice * 2;
        }

        else
        {
            totalPrice += PriceConfigurations.withTubeTyrePrice * 2;
        }

        switch (cycleConfiguration.noOfGears)
        {
            case 1: totalPrice += PriceConfigurations.oneGearPrice;
                break;
            case 2:
                totalPrice += PriceConfigurations.twoGearPrice;
                break;
            case 3:
                totalPrice += PriceConfigurations.threeGearPrice;
                break;
            case 4:
                totalPrice += PriceConfigurations.fourGearPrice;
                break;
                default:
                	totalPrice += PriceConfigurations.noGear;
        }

        return totalPrice;
    }

}