package ify;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double masa;
        System.out.println(" Podaj mase obiektu :");
        masa = keyboard.nextDouble();
        double przyciaganieZiemskie =9.8;
        double ciezar=masa*przyciaganieZiemskie;
        System.out.println("ciezar wynosi:"+ciezar);
        if(ciezar>1000) {
            System.out.println("obiekt jest zbyt ciezki");
        }
        else if(ciezar<10) {
            System.out.println("obiekt jest zbyt lekki");
        }


    }
}
