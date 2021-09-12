package com.company.Day2;

public class Task11 {
    public static void main(String[] args)
    {
        String wyraz = "tenet";
        int dlugosc = wyraz.length();
        int licznik = 0;

        for(int i = 0; i < dlugosc/2; i++)
        {
            if(wyraz.charAt(i) == wyraz.charAt(dlugosc-(i+1)))
                licznik += 1;
        }

        if(licznik == dlugosc/2)
            System.out.println("Tak");
        else
            System.out.println("Nie");
    }
}
