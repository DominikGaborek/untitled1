package ify;

import java.util.Scanner;

public class zad7 {
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
        char inicjal1 = imie1.charAt(0);
        char inicjal2 = imie2.charAt(0);
        char inicjal3 = imie3.charAt(0);

        if (inicjal1 < inicjal2) {

        }
        else if (inicjal1 < inicjal3) {

        }
        else if (inicjal2 < inicjal3) {
            System.out.println(imie1 + imie2 + imie3);
        }
       else  if(inicjal2<inicjal1){
            System.out.println();

        }
        else if(inicjal3<inicjal2){
            System.out.println(imie3+imie2+imie1);

        }
    }
}
