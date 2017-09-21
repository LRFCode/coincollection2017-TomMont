package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Twenty
{
    int year;
    int sn;

    public Twenty(int year, int sn)
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
        return new BigDecimal("20.00");
    }
}