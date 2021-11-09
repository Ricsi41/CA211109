package com.company;

public class oceania
{
    private String orszag;
    private int terulet;
    private int lakossag;
    private int neps;

    public oceania(String orszag, int terulet, int lakossag)
    {
        this.orszag = orszag;
        this.terulet = terulet;
        this.lakossag = lakossag;
    }
    public String getOrszag()
    {
        return orszag;
    }
    public int getTerulet()
    {
        return terulet;
    }
    public int getLakossag()
    {
        return lakossag;
    }
    public int getNepsuruseg()
    {
        return lakossag / terulet;
    }


}
