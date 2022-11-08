package ify;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double liczbaSekund;
        System.out.println(" wprowadz liczbe sekund :");
        liczbaSekund = keyboard.nextDouble();
        if(liczbaSekund>=60){
            double liczbaMinut=liczbaSekund/60;
            System.out.println(" liczba minut :"+liczbaMinut);
        }
        if(liczbaSekund>=3600){
            double liczbaGodzin=liczbaSekund/3600;
            System.out.println(" liczba godzin :"+liczbaGodzin);
        }
        if(liczbaSekund>=86400){
            double liczbaDni=liczbaSekund/86400;
            System.out.println(" liczba dni :"+liczbaDni);
        }

    }
}
