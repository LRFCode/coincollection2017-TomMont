package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Ten
{
    int year;
    int sn;

    public Ten(int year, int sn)
    {
        this.year = year;
        this.sn = sn;

    }

    public int getSerialNumber()
    {
        return sn;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("10.00");
    }
}