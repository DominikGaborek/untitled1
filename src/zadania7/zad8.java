package zadania7;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int liczbaLat;
        int suma=0;
        double srednia=0;
        System.out.println(" liczba lat:");
        liczbaLat = keyboard.nextInt();
        if(liczbaLat<1) {
            System.out.println("bład");
        }
        for (int i = 1; i <= liczbaLat; i++) {

            for (int n = 1; n <= 12; n++) {
                int liczbaOpadów;
                System.out.println(" liczba centymetrow opadow w " + n + "miesiącu: ");
                liczbaOpadów = keyboard.nextInt();
                if(liczbaOpadów<0) {

                }
                    System.out.println("bład");
                 suma+=liczbaOpadów;
                srednia=(double)suma/(double)n;


                }



            }
        System.out.println(" liczba miesiecy: "+liczbaLat*12);
        System.out.println(" łączna liczba centymetrów opadów: "+ suma );
        System.out.println(" średni poziom opadów: "+ srednia);

        }
    }

