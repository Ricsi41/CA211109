package com.company;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args)
    {
        ArrayList<oceania> oceaniak = new ArrayList<>();
        try
        {
            System.setProperty("file.encoding","UTF8");
            FileReader fr = new FileReader("ausztralia_oceania.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine())!=null)
            {
                String[] db = line.split(";");
                String orszag = db[0];
                int terulet = Integer.parseInt(db[1]);
                int lakossag = Integer.parseInt(db[2]);
                oceania kk = new oceania(orszag, terulet, lakossag);
                oceaniak.add(kk);
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Hiba a beolvasáskor "+e);
        }
        for (int i = 0; i < oceaniak.size(); i++)
        {
            System.out.println(oceaniak.get(i).getOrszag()+" "+oceaniak.get(i).getNepsuruseg());
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index_01 = 0;
        int index_02 = 0;
        for (int i = 0; i < oceaniak.size(); i++)
        {
           if (oceaniak.get(i).getLakossag() < min)
           {
               min = oceaniak.get(i).getLakossag();
               index_01 = i;
           }
        }
        for (int i = 0; i <oceaniak.size(); i++)
        {
            if(oceaniak.get(i).getTerulet() > max)
            {
                max = oceaniak.get(i).getTerulet();
                index_02 = i;
            }
        }
        System.out.println("A legkisebb lakossággal rendelkező ország: "+oceaniak.get(index_01).getOrszag()+" és a területe: "+oceaniak.get(index_01).getTerulet());
        System.out.println("A legnagyobb területű ország: "+oceaniak.get(index_02).getOrszag()+" és a lakossága: "+oceaniak.get(index_02).getLakossag());
    }
}
