package ify;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double pakietA =39.99;
        double pakietB =59.99;
        double pakietC =69.99;
        String pakiet;
        System.out.println(" podaj pakiet ktory cie interesuje :");
        pakiet = keyboard.nextLine();
        double czasRozmów;
        System.out.println(" podaj czas rozmów :");
        czasRozmów = keyboard.nextDouble();
        if(pakiet.equalsIgnoreCase("A")){
            if(czasRozmów<=450){
                System.out.println("cena pakietu wyniesie cie"+pakietA);
            }
            else if (czasRozmów>450){
                double dodatkoweMinuty=(czasRozmów-450)*0.45;
                double cenaAzminutami=pakietA+dodatkoweMinuty;
                System.out.println("cena pakietu wyniesie cie"+cenaAzminutami);


            }

        }
        else if(pakiet.equalsIgnoreCase("B")){
            if(czasRozmów<=900){
                System.out.println("cena pakietu wyniesie cie"+pakietB);
            }
            else if (czasRozmów>900){
                double dodatkoweMinuty2=(czasRozmów-900)*0.40;
                double cenaBzminutami=pakietA+dodatkoweMinuty2;
                System.out.println("cena pakietu wyniesie cie"+cenaBzminutami);


            }

        }
        if(pakiet.equalsIgnoreCase("C")){

                System.out.println("cena pakietu wyniesie cie"+pakietC);


        }
    }
}
