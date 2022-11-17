package ify;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double liczbaCzekow;
        System.out.println(" Podaj liczbe czeków :");
        liczbaCzekow = keyboard.nextDouble();
        if(liczbaCzekow<20){
            double cenaCzekow=liczbaCzekow*0.10;
            double cenamiesieczna1=cenaCzekow+10;
            System.out.println("cena oplaty"+cenamiesieczna1);
        }
        else if(liczbaCzekow>=20 || liczbaCzekow<=39){
            double cenaCzekow=liczbaCzekow*0.08;
            double cenamiesieczna2=cenaCzekow+10;
            System.out.println("cena oplaty"+cenamiesieczna2);
        }
        else if(liczbaCzekow>=40 || liczbaCzekow<=59){
            double cenaCzekow=liczbaCzekow*0.06;
            double cenamiesieczna3=cenaCzekow+10;
            System.out.println("cena oplaty"+cenamiesieczna3);
        }
        else if(liczbaCzekow>=60){
            double cenaCzekow=liczbaCzekow*0.04;
            double cenamiesieczna4=cenaCzekow+10;
            System.out.println("cena oplaty"+cenamiesieczna4);
        }

    }
}
