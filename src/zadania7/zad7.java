package zadania7;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int liczbaPieter;
        int liczbaWszystkichPokoi=0;
        int liczbaZajetychPokoi=0;
        System.out.println(" wprowadz liczbe pięter :");
        liczbaPieter = keyboard.nextInt();
        for(int i=1;i<=liczbaPieter;i++){
            int liczbaWszystkichPokoipietra;
            System.out.println(" wprowadz liczbe pokoi "+i+" pietra :");
            liczbaWszystkichPokoipietra = keyboard.nextInt();
            int liczbaZajetychPokoipietra;
            System.out.println(" wprowadz liczbe zajętych pokoi "+i+" pietra :");
            liczbaZajetychPokoipietra = keyboard.nextInt();
            liczbaWszystkichPokoi +=liczbaWszystkichPokoipietra;
            liczbaZajetychPokoi +=liczbaZajetychPokoipietra;
            if(i==liczbaPieter){
            double poziomOblozenia=(double)liczbaZajetychPokoi/(double)liczbaWszystkichPokoi;

            System.out.println("liczba wszystich pokoi to "+liczbaWszystkichPokoi);
            System.out.println("liczba zajetych pokoi to "+liczbaZajetychPokoi);
            System.out.println("poziomOblozenia to "+poziomOblozenia);

        }
        }
    }
}
