package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Hundred
{
    int year;
    int sn;

    public Hundred(int year, int sn)
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
        return new BigDecimal("100.00");
    }
}