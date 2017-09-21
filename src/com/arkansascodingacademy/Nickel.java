package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Nickel
{
    int year;

    public Nickel(int year)
    {
        this.year = year;
    }
    public static BigDecimal getFaceValue()
    {
        return new BigDecimal ("0.05");
    }
    public BigDecimal getCollectibleValue()
    {
        if(year >= 1935)
        {
            return getFaceValue();
        }
        else
        {
            BigDecimal multiplier = new BigDecimal("0.10");
            BigDecimal difference = new BigDecimal(1935 - year + "");
            BigDecimal result = new BigDecimal(0);
            result = multiplier.multiply(difference);
            return getFaceValue().add(result);
        }
    }
}
