package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Quarter
{
    int year;

    public Quarter(int year)
    {
        this.year = year;
    }
    public static BigDecimal getFaceValue()
    {
        return new BigDecimal ("0.25");
    }
    public BigDecimal getCollectibleValue()
    {
        if (year >= 1923)
        {
            return getFaceValue();
        }
        else
        {
            BigDecimal multiplier = new BigDecimal("0.22");
            BigDecimal difference = new BigDecimal(1923 - year + "");
            BigDecimal result = new BigDecimal(0);
            result = multiplier.multiply(difference);
            return getFaceValue().add(result);
        }
    }
}
