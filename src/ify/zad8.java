package ify;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        double cenaPakietu =99;
        Scanner keyboard = new Scanner(System.in);
        double liczbaZakupionychPakietow;
        System.out.println(" liczba zakupionych pakietow :");
        liczbaZakupionychPakietow = keyboard.nextDouble();
        if(liczbaZakupionychPakietow>=10 && liczbaZakupionychPakietow<=19){
            double rabat =0.20;
            double NaliczonyRabat=cenaPakietu*liczbaZakupionychPakietow*rabat;
            double cenaDoZaplaty=cenaPakietu*liczbaZakupionychPakietow*0.80;
            System.out.println("rabat 20%");
            System.out.println("cena"+cenaDoZaplaty);
        }
        else if(liczbaZakupionychPakietow>=20 && liczbaZakupionychPakietow<=49){
            double rabat =0.30;
            double NaliczonyRabat=cenaPakietu*liczbaZakupionychPakietow*rabat;
            double cenaDoZaplaty=cenaPakietu*liczbaZakupionychPakietow*0.70;
            System.out.println("rabat 30%");
            System.out.println("cena"+cenaDoZaplaty);
        }
        else if(liczbaZakupionychPakietow>=50 && liczbaZakupionychPakietow<=99){
            double rabat =0.40;
            double NaliczonyRabat=cenaPakietu*liczbaZakupionychPakietow*rabat;
            double cenaDoZaplaty=cenaPakietu*liczbaZakupionychPakietow*0.60;
            System.out.println("rabat 40%");
            System.out.println("cena"+cenaDoZaplaty);
        }
        else if(liczbaZakupionychPakietow>=100){
            double rabat =0.50;
            double NaliczonyRabat=cenaPakietu*liczbaZakupionychPakietow*rabat;
            double cenaDoZaplaty=cenaPakietu*liczbaZakupionychPakietow*0.50;
            System.out.println("rabat 50%");
            System.out.println("cena"+cenaDoZaplaty);
        }
    }
}
