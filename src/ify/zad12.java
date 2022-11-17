package ify;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String material;
        System.out.println(" wpisz powietrze, woda lub stal :");
        material = keyboard.nextLine();

        double odleglosc;
        System.out.println(" podaj odleglosc :");
        odleglosc = keyboard.nextDouble();

        double czasPowietrze=odleglosc/343;
        double czasWoda=odleglosc/1490;
        double czasStal=odleglosc/5100;

        if(material.equalsIgnoreCase("powietrze")){
            System.out.println(czasPowietrze);

        }
        else if(material.equalsIgnoreCase("woda")){
            System.out.println(czasWoda);

        }
        else if(material.equalsIgnoreCase("stal")){
            System.out.println(czasStal);

        }
    }
}
