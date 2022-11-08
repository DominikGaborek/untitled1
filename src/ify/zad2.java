package ify;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double dzien;
        System.out.println("Podaj dzien x :");
        dzien = keyboard.nextDouble();

        double miesiac;
        System.out.println("Podaj miesiac x :");
        miesiac = keyboard.nextDouble();

        double rok;
        System.out.println("Podaj dwa ostatnie cyfry roku:");
        rok = keyboard.nextDouble();
        double iloczynDniaiMiesiaca=dzien*miesiac;
         if (iloczynDniaiMiesiaca==rok)
         {
            System.out.println("data jest magiczna!");
        }

        else if ((dzien*miesiac)!=rok) {




                System.out.println("data nie jest magiczna!");
        }

    }
}
