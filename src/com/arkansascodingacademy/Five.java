package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Five
{
    int year;
    int sn;

    public Five(int year, int sn)
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
        return new BigDecimal("5.00");
    }
}