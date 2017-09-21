package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Dime
{
    int year;

    public Dime(int year)
    {
        this.year = year;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal ("0.10");
    }

    public BigDecimal getCollectibleValue()
    {
        return  getFaceValue();
    }
}
