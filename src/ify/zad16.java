package ify;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double liczbaksiazek;
        System.out.println(" Podaj liczbe ksiazek :");
        liczbaksiazek = keyboard.nextDouble();
        if(liczbaksiazek==0){
            double liczbapkt=0;
            System.out.println("liczba punktow" +liczbapkt);
        }
        else if(liczbaksiazek==1){
            double liczbapkt=5;
            System.out.println("liczba punktow" +liczbapkt);
        }
        else if(liczbaksiazek==2){
            double liczbapkt=15;
            System.out.println("liczba punktow" +liczbapkt);
        }
        else if(liczbaksiazek==3){
            double liczbapkt=30;
            System.out.println("liczba punktow" +liczbapkt);
        }
        else if(liczbaksiazek>=4){
            double liczbapkt=60;
            System.out.println("liczba punktow" +liczbapkt);
        }


    }
}
