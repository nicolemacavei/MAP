package com.company;

import java.util.Scanner;

public class Aufgabe4 {
    protected int[] tastatur = new int[100];
    protected int[] usb = new int[100];

    public Aufgabe4(int[] array1, int[] array2) {
        this.tastatur = array1;
        this.usb = array2;
    }

    public void run() {

        System.out.println("Die billigste Tastatur ist: ");
        System.out.println(aufgabe1());

        System.out.println("Das teuerste Gegenstand ist: ");
        System.out.println(aufgabe2());

        System.out.println("Das teuerste UBS das Markus kaufen kann ist: ");
        System.out.println(aufgabe3(50));

        System.out.println("Das teuerste UBS und Tastatur das Markus kaufen kann ist: ");
        System.out.println(aufgabe4(59));
    }

    //Die erste Aufgabe
    public int aufgabe1() {

        //Das kleinte Element wird mit dem ersten Element initialisiert.
        int min = this.tastatur[0];
        for(int i:this.tastatur){
            if(i < min)
                min = i;
        }
        return min;
    }

    //Die zweite Aufgabe
    public int aufgabe2() {
        int max = this.tastatur[0];

        //Wei die zwei Arrays verschiedene Langen hat, machen wir 2 loops.
        for(int i : this.usb){
            if(i > max)
                max = i;
        }
        for(int i : this.tastatur){
            if(i > max)
                max = i;
        }

        return max;
    }

    public int aufgabe3(int b) {
        int max = 0;

        //Falls der element kleiner als das Budget ist und
        for(int i : this.usb){
            if(i <= b && i > max)
                max = i;
        }

        return max;
    }

    public int aufgabe4(int b) {
        int max= -1;

        for(int i:this.tastatur)
            for(int j:usb)
                if(i+j <= b && max < i+j)
                    max = i+j;

        return max;
    }

}
