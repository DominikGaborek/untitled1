package zadania7;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class zad3 {
    public static void main(String[] args)throws IOException {



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
            PrintWriter pw = new PrintWriter("droga.txt");

            pw.println("droga przebyta" +" "+ odleglosc);


            pw.close();
        }

        System.out.println("Wyszedłem z pętli");
    }
}
