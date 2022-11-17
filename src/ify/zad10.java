package ify;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double kalorie;
        System.out.println(" podaj liczbe kalori :");
        kalorie = keyboard.nextDouble();
        double gramTluszczu;
        System.out.println(" podaj ile gramow tluszczu:");
        gramTluszczu = keyboard.nextDouble();

        double kaloriezTluszczu= gramTluszczu * 9;
        if(kaloriezTluszczu>=kalorie){
            System.out.println("blad");
        }
        double procentkalori= kaloriezTluszczu /kalorie;
        if(kaloriezTluszczu<30 ){
            System.out.println( "produkt jest niskotlusczowy");
            System.out.println( "produkt ma"+procentkalori+"procent tluszczu");
        }
        else if(kaloriezTluszczu>=30 ){
            System.out.println( "produkt ma"+procentkalori+"procent tluszczu");
        }


    }
}
