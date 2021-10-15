package com.company;

import java.util.Scanner;

public class Aufgabe2 {

    protected int[] zahlen = new int[50];
    public Aufgabe2(int[] array) {
        this.zahlen = array;
    }

    public void run() {

        //Subpunctul 1
        int nrMax = this.zahlen[0];
        for (int j : this.zahlen) {
            if (j > nrMax)
                nrMax = j;
        }
        System.out.println("Nr maxim este " + nrMax);

        //Subpunctul 2
        int nrMin = this.zahlen[0];

        for (int j : this.zahlen) {
            if (j < nrMin)
                nrMin = j;
        }
        System.out.println("Nr minim este " + nrMin);

        //Subpunctul 3
        int sum = 0;
        for (int j : this.zahlen) {
            sum += j;
        }
        System.out.println("Suma maxima a n-1 elemente este " + (sum - nrMin));

        //Subpunctul 5
        System.out.println("Suma minima a n-1 elemente este " + (sum - nrMax));
    }
}