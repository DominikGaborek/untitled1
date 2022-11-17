package petle;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        boolean twierdzenie =true;
        Scanner scan = new Scanner(System.in);
        char znak;

        while (twierdzenie) {

            System.out.println("Podaj znak T,t,N,n");
            String pobrac=scan.nextLine();
            znak = pobrac.charAt(0);

            if(znak=='T'||znak=='t' ||znak=='N'||znak=='n') {
                twierdzenie = true;
            }else {
                twierdzenie = false;

            }

            System.out.println("Podałeś "+ znak);


        }
        System.out.println("Wyszedłem z pętli.");
    }
}