package zadania7;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String lancuch;
        System.out.println(" wprowadz lancuch znakow :");
        lancuch = keyboard.nextLine();
        String znak;
        System.out.println(" wprowadz znak :");
        znak = keyboard.nextLine();
        int a = 0;
        int dlugosc=lancuch.length();
        char litera1=znak.charAt(0);
        char inicjal;
        for (int i =0;i <dlugosc; i++) {
            inicjal=lancuch.charAt(i);
            if (inicjal==litera1)
            {
                a=a+1;
            }


        }
        System.out.println("liczba wystąpien "+a );
    }
}
