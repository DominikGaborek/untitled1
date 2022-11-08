import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double cenaplyty ;
        double marza=0.4;
        System.out.println("Podaj cene płyty: ");
        cenaplyty = klawiatura.nextInt();
        klawiatura.nextLine();

        double zysk;
        zysk = cenaplyty*marza;

        System.out.println( " zysk wynosi " + zysk);


    }
}