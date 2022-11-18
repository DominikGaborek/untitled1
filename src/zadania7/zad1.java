package zadania7;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int liczba;
        System.out.println(" wprowadz liczbe dodatnią nie zerową całkowitą :");
        liczba = keyboard.nextInt();
        for (int i =1;i <liczba; i++) {
            int suma=i+i;

            int sumaostateczna=suma+i;

            System.out.println("suma liczb wynosi " + sumaostateczna);


        }
        System.out.println("Wyszedłem z pętli");

    }
    }

