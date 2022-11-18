package zadania7;

import java.util.Scanner;


public class zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int szybkosc;
        System.out.println(" wprowadz szybkosc pojazdu :");
        szybkosc = keyboard.nextInt();
        int liczbaGodzin;
        System.out.println(" wprowadz liczbe godzin :");
        liczbaGodzin = keyboard.nextInt();

        for (int i =1;i <=liczbaGodzin; i++) {
            int odleglosc=szybkosc *i;
            System.out.println("odleglosc przebyta po "+i+" " +odleglosc );

        }
        System.out.println("Wyszedłem z pętli");
    }
}
