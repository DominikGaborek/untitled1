import java.util.Scanner;
public class zad17{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double cena;

        System.out.println("Podaj cene posiłku: ");
        cena = klawiatura.nextDouble();
        klawiatura.nextLine();
        double procentNapiwka=0.20;
        double procentCeny=0.0675;
        Double podatek;
        podatek = procentCeny*cena;
        Double napiwek;
        napiwek = procentNapiwka*(cena+podatek);
        Double ogolne;
        ogolne = cena+podatek+napiwek;

        System.out.println("cena posiłku wynosi: " +  cena);
        System.out.println("Wartość podatku: " +  podatek);
        System.out.println("Napiwek wynosi " +  napiwek);
        System.out.println("Ogólna cena wynosi " +  ogolne);
    }
}

