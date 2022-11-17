package petle;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        boolean twierdzenie =true;
        Scanner scan = new Scanner(System.in);
        String znak;

        while (twierdzenie) {

            System.out.println("Podaj tak lub nie");

            znak = scan.nextLine();

            if(znak.equals("tak")||znak.equals("nie")) {
                twierdzenie = true;
                System.out.println("Podałeś "+ znak);
            }else {
                twierdzenie = false;

            }




        }
        System.out.println("Wyszedłem z pętli.");
    }
}

