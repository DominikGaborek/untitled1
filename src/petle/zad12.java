package petle;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {

        for (int i = 1, j = 30; i < 30; i++, j--) {
            double suma=(double)i/j;
            System.out.println(suma);

        }
        System.out.println("Wyszedłem z pętli");
    }
}