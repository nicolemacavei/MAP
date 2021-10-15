package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.company.Main.citire;

public class Aufgabe1 {
    protected int[] noten = new int[50];

    public Aufgabe1(int[] array) {
        this.noten = array;
    }

    public void run() {

        //Alle 4 Augaben werden in Funktionen geteilt:
        System.out.println("Die nict Ausreichenden Noten: ");
        System.out.println(aufgabe1());

        System.out.println("Der Durchschnittswert ist: ");
        System.out.println(aufgabe2(this.noten));

        System.out.println("Die Abgerundeten Noten sind: ");
        int[] abgerundeteNoten = aufgabe3(noten);
        System.out.println(Arrays.toString(abgerundeteNoten));

        System.out.println("Die maximale Abgerundete Note ist: ");
        System.out.println(aufgabe4(abgerundeteNoten));
    }

    //Die erste Ubung
    public ArrayList<Integer> aufgabe1() {

        //Das neue Array das die nicht ausreichende Noten enthalt;
        List<Integer> kleineNoten = new ArrayList<Integer>();

        //Wir durchlaufen den Noten Array und wahlen die die kleiner als 38 sind
        for(int i : this.noten){
            if(i < 38)
                kleineNoten.add(i);
        }
        return (ArrayList<Integer>) kleineNoten;
    }

    //Die zweite Ubung
    public double aufgabe2(int[] noten) {

        int s = 0;  //die Summe fur den Durchschnitt.

        for(int i : noten){
            s += i;
        }

        return (double)s/noten.length;
    }

    //Die dritte Ubung
    public int[] aufgabe3(int[] noten) {

        int[] abgerundeteNoten = new int[noten.length]; //Das Array mit abgerundete Noten

        for(int i = 0; i < noten.length; i++){

            //if the grade is smaller than 38 or
            //the difference between the grade and the next multiple of 5 is bigger than 2
            //or it is a multiple of 5, than the grade remans unchanged
            if(noten[i] < 38 || (noten[i]/5+1)*5-noten[i]>2 || noten[i]%5 == 0)
                abgerundeteNoten[i] = noten[i];
            else
                abgerundeteNoten[i] = (noten[i]/5+1)*5;
        }

        return abgerundeteNoten;
    }

    //Die vierte Ubung
    public int aufgabe4(int[] abgerundeteNoten) {

        int max = -1;

        for(int i : abgerundeteNoten){
            if(max < i && i > 37)
                max = i;
        }

        return max;
    }
}
