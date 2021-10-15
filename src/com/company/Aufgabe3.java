package com.company;

import java.util.Arrays;

public class Aufgabe3 {

    protected int[] tastatur = new int[100];
    protected int[] usb = new int[100];


    //constructor
    public Aufgabe3(int[] tastatur,int[] usb) {
            this.usb = usb;
            this.tastatur = tastatur;
     }

    public void run() {


        System.out.println("Die Summe ist: ");
        System.out.println(aufgabe1());

        System.out.println("Die Differenz ist:");
        System.out.println(pr2());

        System.out.println("Die MUltiplikation ist: ");
        System.out.println(pr3(9));

        System.out.println("Die Division ist: ");
        System.out.println(pr4(9));
    }

    //Die erste Ubung
    private int aufgabe1() {
        int[] c = new int[this.tastatur.length + 1];
        int ok = 0;
        for (int i = this.tastatur.length - 1; i >= 0; i--) {
            int x = this.tastatur[i] + this.tastatur[i];
            if (ok == 1) {
                x += 1;
            }
            if (x > 9) {
                c[i + 1] = x % 10;
                ok = 1;
            } else {
                c[i + 1] = x;
                ok = 0;
            }
        }

        if (ok == 1) {
            c[0] = 1;
            System.out.println(Arrays.toString(c));
        } else {
            int[] newarray = Arrays.copyOfRange(c, 1, this.tastatur.length + 1);
            System.out.println(Arrays.toString(newarray));
        }

        System.out.println();
        return c.length;
    }

    //2. Differenz der Ziffern des Arrays. z.B. [8 3 0 0 0 0 0 0 0] [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
    private int pr2() {
        int[] c = new int[this.tastatur.length];
        int ok = 0;
        for (int i = this.tastatur.length- 1; i >= 0; i--) {
            int x = this.tastatur[i] - this.usb[i];
            if (ok == 1) {
                x -= 1;
            }
            if (x < 0) {
                c[i] = 10 + x;
                ok = 1;
            } else {
                c[i] = x;
                ok = 0;
            }
        }

        for (int i : c) {
            System.out.print(" " + i);
        }
        int nr = 0;
        for (int i : c) {
            if (i == 0) {
                nr++;
            } else {
                break;
            }
        }

        int[] newarray = Arrays.copyOfRange(c, nr, this.tastatur.length);
        System.out.println();
        return newarray.length;
    }

    //3. Berechnen Sie die Multiplikation. Die erste Zahl ist eine große Zahl, die zweite Zahl ist nur eine Ziffer z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
    public int pr3(int y) {
        int[] c = new int[this.tastatur.length + 1];
        int ok = 0;
        for (int i = this.tastatur.length - 1; i >= 0; i--) {
            int x = this.tastatur[i] * y;
            if (ok != 0) {
                x += ok;
            }
            if (x > 9) {
                c[i + 1] = x % 10;
                ok = x / 10;
            } else {
                c[i + 1] = x;
                ok = 0;
            }
        }

        if (ok != 0) {
            c[0] = (this.tastatur[0] * y) / 10;
            System.out.println(Arrays.toString(c));
        } else {
            int[] newarray = Arrays.copyOfRange(c, 1, this.tastatur.length+ 1);
            System.out.println(Arrays.toString(newarray));
        }
        System.out.println();
        return 0;
    }

    private int pr4(int y) {
        int[] c = new int[this.tastatur.length];
        int ok = 0;
        int x;
        for (int i = 0; i <= this.tastatur.length - 1; i++) {
            x = ok * 10 + this.tastatur[i];
            ok = x % y;
            x /= y;
            c[i] = x;
        }

        if (c[0] == 0) {
            int[] newarray = Arrays.copyOfRange(c, 1, this.tastatur.length);
            System.out.println(Arrays.toString(newarray));
        } else {
            System.out.println(Arrays.toString(c));
        }
        System.out.println();
        return 0;
    }
}
