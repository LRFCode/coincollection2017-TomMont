package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CoinCollection
{

    private ArrayList<Penny> pennies = new ArrayList<>();
    private ArrayList<Nickel> nickels = new ArrayList<>();
    private ArrayList<Dime> dimes = new ArrayList<>();
    private ArrayList<Quarter> quarters = new ArrayList<>();
    private ArrayList<One> ones = new ArrayList<>();
    private ArrayList<Five> fives = new ArrayList<>();
    private ArrayList<Ten> tens = new ArrayList<>();
    private ArrayList<Twenty> twenties = new ArrayList<>();
    private ArrayList<Hundred> hundreds = new ArrayList<>();


    public CoinCollection(int quarterCount, int dimeCount, int nickelCount, int pennyCount)
    {
        for (int i = 0; i < pennyCount; i++)
        {
            Penny penny = new Penny(2000);
            pennies.add(penny);
        }
        for (int i = 0; i < nickelCount; i++)
        {
            Nickel nickel = new Nickel(2000);
            nickels.add(nickel);
        }
        for (int i = 0; i < dimeCount; i++)
        {
            Dime dime = new Dime(2000);
            dimes.add(dime);
        }
        for (int i = 0; i < quarterCount; i++)
        {
            Quarter quarter = new Quarter (2000);
            quarters.add(quarter);
        }


    }

    public boolean snOnesAlreadyExists(int currentsn)
    {
        for(One one : ones)
        {
            if(one.getSerialNumber() == currentsn)
            {
                return true;
            }
        }
        return false;
    }

    public boolean snFivesAlreadyExists()
    {
        for(Five five : fives)
        {
            if(five.getSerialNumber() == five.sn)
            {
                return true;
            }
        }
        return false;
    }

    public boolean snTensAlreadyExists()
    {
        for(Ten ten : tens)
        {
            if(ten.getSerialNumber() == ten.sn)
            {
                return true;
            }
        }
        return false;
    }

    public boolean snTwentiesAlreadyExists()
    {
        for(Twenty twenty : twenties)
        {
            if(twenty.getSerialNumber() == twenty.sn)
            {
                return true;
            }
        }
        return false;
    }

    public boolean snHundredsAlreadyExists()
    {
        for(Hundred hundred : hundreds)
        {
            if(hundred.getSerialNumber() == hundred.sn)
            {
                return true;
            }
        }
        return false;
    }

    public void addPenny(int year)
    {
        Penny penny = new Penny(year);
        pennies.add(penny);
    }

    public void addNickel(int year)
    {
        Nickel nickel = new Nickel(year);
        nickels.add(nickel);
    }

    public void addDime(int year)
    {
        Dime dime = new Dime(year);
        dimes.add(dime);
    }

    public void addQuarter(int year)
    {
        Quarter quarter = new Quarter (year);
        quarters.add(quarter);
    }

    public BigDecimal getPenniesFaceValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Penny penny : pennies)
        {
            total = total.add(penny.getFaceValue());
        }
        return total;
    }

    public BigDecimal getNickelsFaceValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Nickel nickel : nickels)
        {
            total = total.add(nickel.getFaceValue());
        }
        return total;
    }

    public BigDecimal getDimesFaceValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Dime dime : dimes)
        {
            total = total.add(dime.getFaceValue());
        }
        return total;
    }

    public BigDecimal getQuartersFaceValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Quarter quarter : quarters)
        {
            total = total.add(quarter.getFaceValue());
        }
        return total;
    }

    public BigDecimal getPenniesCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Penny penny : pennies)
        {
            total = total.add(penny.getCollectibleValue());
        }
        return total;
    }

    public BigDecimal getNickelsCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Nickel nickel : nickels)
        {
            total = total.add(nickel.getCollectibleValue());
        }
        return total;
    }

    public BigDecimal getDimesCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Dime dime : dimes)
        {
            total = total.add(dime.getCollectibleValue());
        }
        return total;
    }

    public BigDecimal getQuartersCollectibleValue()
    {
        BigDecimal total = new BigDecimal ("0.00");
        for (Quarter quarter : quarters)
        {
            total = total.add(quarter.getCollectibleValue());
        }
        return total;
    }

    public BigDecimal getFaceValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Penny penny : pennies)
        {
            total = total.add(penny.getFaceValue());
        }
        for (Nickel nickel : nickels)
        {
            total = total.add(nickel.getFaceValue());
        }
        for (Dime dime : dimes)
        {
            total = total.add(dime.getFaceValue());
        }
        for (Quarter quarter : quarters)
        {
            total = total.add(quarter.getFaceValue());
        }
        return total;
    }

    public BigDecimal getCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0.00");
        for (Penny penny : pennies)
        {
            total = total.add(penny.getCollectibleValue());
        }
        for (Nickel nickel : nickels)
        {
            total = total.add(nickel.getCollectibleValue());
        }
        for (Dime dime : dimes)
        {
            total = total.add(dime.getCollectibleValue());
        }
        for (Quarter quarter : quarters)
        {
            total = total.add(quarter.getCollectibleValue());
        }
        return total;
    }
}

