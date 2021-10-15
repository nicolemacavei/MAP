package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("The first exercise: ");
        int[] array = citire();
        Aufgabe1 auf = new Aufgabe1(array);
        auf.run();
        System.out.println();

        System.out.println("The second exercise: ");
        array = citire();
        Aufgabe2 zahlen = new Aufgabe2(array);
        zahlen.run();
        System.out.println();

        System.out.println("The third exercise: ");
        int[] array1 = citire();
        int[] array2 = citire();
        Aufgabe3 a = new Aufgabe3(array1, array2);
        a.run();
        System.out.println();

        System.out.println("The fourth exercise: ");
        array1 = citire();
        array2 = citire();
        Aufgabe4 b = new Aufgabe4(array1, array2);
        b.run();
        System.out.println();
    }

    public static int[] citire() {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = s.nextInt();        //Saving the lenghts of the array

        int[] noten = new int[n];
        System.out.println("Enter the numbers in array: ");
        for(int i=0; i < n; i++)
            noten[i] = s.nextInt();

        return noten;
    }
}
