package ify;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double test1;
        System.out.println("Podaj wynik testu 1 :");
        test1 = keyboard.nextDouble();
        keyboard.nextLine();
        double test2 = 0;
        System.out.println("Podaj wynik testu 2 :");
        test2 = keyboard.nextDouble();
        keyboard.nextLine();
        double test3;
        System.out.println("Podaj wynik testu 3 :");
        test3 = keyboard.nextDouble();
        keyboard.nextLine();
        double srednia= (test1+test2+test3)/3;
        System.out.println("srednia"+srednia);
        if(srednia>=90) {
            System.out.println("5");
        }
        else if(srednia>=80 || srednia<=89) {
            System.out.println("4");
        }
        else if(srednia>=70 || srednia<=79){
            System.out.println("3");
        }
        else if(srednia>=60 || srednia<=69) {
            System.out.println("2");
        }
        else if(srednia<=60) {
            System.out.println("1");
        }
    }
}
