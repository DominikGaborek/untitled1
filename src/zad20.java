import java.util.Scanner;
public class zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double iloscCiastek =48;
        double cukier = 1.5;
        double maslo  = 1;
        double maka = 2.75;

        double jednociastkocukier = (cukier/iloscCiastek);
        double jednociastkomaslo = (maslo/iloscCiastek);
        double jednociastkomaka = (maka/iloscCiastek);
        double iloscciastek;

        System.out.println(" ile chcesz zrobic ciastek?: ");
        iloscciastek = klawiatura.nextInt();
        klawiatura.nextLine();

        double cukier1 = jednociastkocukier*iloscciastek;
        double maslo1 = jednociastkomaslo*iloscciastek;
        double maka1 = jednociastkomaka*iloscciastek;
        System.out.println("ilość szklanek cukru: " + cukier1 );
        System.out.println("ilość szklanek masła: " + maslo1 );
        System.out.println("ilość szklanek mąki: " + maka1 );
    }
}