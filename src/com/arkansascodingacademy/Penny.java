package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Penny
{
    int year;


    public Penny(int year)
    {
        this.year = year;
    }
    public static BigDecimal getFaceValue()
    {
        return new BigDecimal ("0.01");
    }
    public BigDecimal getCollectibleValue()
    {
        if (year >= 1945)
        {
            return getFaceValue();
        }
        else
        {
            BigDecimal multiplier = new BigDecimal("0.03");
            BigDecimal difference = new BigDecimal(1945 - year + "");
            BigDecimal result = new BigDecimal(0);
            result = multiplier.multiply(difference);
            return getFaceValue().add(result);
        }
    }
}

