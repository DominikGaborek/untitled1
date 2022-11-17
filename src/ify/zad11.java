package ify;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String imie1;
        System.out.println(" wprowadz imie 1 :");
        imie1 = keyboard.nextLine();

        String imie2;
        System.out.println(" wprowadz imie 2 :");
        imie2 = keyboard.nextLine();

        String imie3;
        System.out.println(" wprowadz imie 3 :");
        imie3 = keyboard.nextLine();
        double czas1;
        System.out.println(" wprowadz czas 1 :");
        czas1 = keyboard.nextDouble();
        double czas2;
        System.out.println(" wprowadz czas 1 :");
        czas2 = keyboard.nextDouble();
        double czas3;
        System.out.println(" wprowadz czas 1 :");
        czas3 = keyboard.nextDouble();

        if(czas1<czas2 && czas2<czas3){
            System.out.println(imie1+imie2+imie3);
        }

        else if(czas1<czas2 && czas2>czas3){
            System.out.println(imie1+imie3+imie2);
        }
        else if(czas1<czas2 && czas2<czas3){
            System.out.println(imie1+imie2+imie3);
        }
        else if(czas1>czas2 && czas1<czas3){
            System.out.println(imie2+imie1+imie3);
        }
        else if(czas1>czas2 && czas3<czas1){
            System.out.println(imie2+imie3+imie1);
        }
        else if(czas3<czas2 && czas2<czas1){
            System.out.println(imie3+imie2+imie1);
        }
        else if(czas3<czas2 && czas2>czas1){
            System.out.println(imie3+imie1+imie2);
        }

    }


}
