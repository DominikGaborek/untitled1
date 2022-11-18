package zadania7;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int liczbaDni;
        double wyplata =1;
        double wyplata1=0;
        double zarobki;
        System.out.println(" podaj ilosc dni wypracowanych :");
        liczbaDni = keyboard.nextInt();
        for (int i =0, b=2;i <liczbaDni; i++) {
            wyplata1=Math.pow(b,i);
            zarobki= wyplata1/100;
            System.out.println("zarobki w "+(i+1) + " dni"+ "wyplatakoncowa " + zarobki +"zl" );

        }
        System.out.println("Wyszedłem z pętli");
    }
}
