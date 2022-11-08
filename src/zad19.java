public class zad19 {
    public static void main(String[] args) {
        double ankietowani1 =0.14;
        double ankietowani2 =0.64;

        double konsumencji = 12467;
        double jedentygodniowo = ankietowani1*konsumencji;
        double cytrusowy = ankietowani2*konsumencji;

        System.out.printf("Średnia osób które kupuja jeden energetyk tygodniowo:%14.0f\n", jedentygodniowo);
        System.out.printf("Przybliżona liczba osób które preferuja smak cytrudowy:%64.0f\n ", cytrusowy);
    }
}