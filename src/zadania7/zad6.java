package zadania7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args)throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String nazwaPliku;
        System.out.println(" podaj nazwe pliku :");
        nazwaPliku = keyboard.nextLine();
        File mojPlik = new File(nazwaPliku);

        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }

        Scanner czytelnikPlik = new Scanner(mojPlik);

        while (czytelnikPlik.hasNext()) {
            String linia =  czytelnikPlik.nextLine();
            System.out.println("Kolejna linia pliku to " + linia);
        }

        czytelnikPlik.close();

        String znak;
        System.out.println(" wprowadz znak :");
        znak = keyboard.nextLine();
        int a = 0;
        int dlugosc=nazwaPliku.length();
        char litera1=znak.charAt(0);
        char inicjal;
        for (int i =0;i <dlugosc; i++) {
            inicjal=nazwaPliku.charAt(i);
            if (inicjal==litera1)
            {
                a=a+1;
            }


        }
        System.out.println("liczba wystąpien "+a );
    }
}
