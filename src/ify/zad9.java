package ify;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double kglubmniej=1.10;
        double od1do3=2.20;
        double od3do5=3.70;
        double powyzej5=3.80;
        int droga=500;
        double wagapaczki;
        System.out.println(" podaj wage paczki:");
        wagapaczki = keyboard.nextDouble();
        double odleglosc;
        System.out.println(" podaj odleglosc:");
        odleglosc = keyboard.nextDouble();
         if(wagapaczki<=1 && odleglosc<501){

        System.out.print("wydasz" +kglubmniej);

        }
        else if (wagapaczki>=1 && wagapaczki<3 && odleglosc<501){

            System.out.print("wydasz" +od1do3);

        }
        else if(wagapaczki<=3 && wagapaczki<5 && odleglosc<501){

            System.out.print("wydasz" +od3do5);

        }
        else if(wagapaczki>=5 && odleglosc<501){

            System.out.print("wydasz" +powyzej5);

        }
         else if(wagapaczki<=1  && odleglosc>500){

             System.out.print("wydasz" +kglubmniej*2);

         }
         else if(wagapaczki>=1 &&wagapaczki>=2 && odleglosc>500){

             System.out.print("wydasz" +od1do3*2);

         }
         else if(wagapaczki>=3 &&wagapaczki<5 && odleglosc>500){

             System.out.print("wydasz" +od3do5*2);

         }
         else if(wagapaczki>=5  && odleglosc>500){

             System.out.print("wydasz" +powyzej5 *2);

         }
    }
}
