import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        String ulubioneMiasto;
        System.out.println("Podaj swoje ulubione miasto");
        ulubioneMiasto=klawiatura.nextLine();
        int dlugosc =ulubioneMiasto.length();
        char inicjal=ulubioneMiasto.charAt(0);
        String duze, male;
        duze =ulubioneMiasto.toUpperCase();
        male =ulubioneMiasto.toLowerCase();
        System.out.println(ulubioneMiasto);
        System.out.println(duze);
        System.out.println(male);
        System.out.println(inicjal);


    }
}
