public class zad18 {
    public static void main(String[] args) {
        double iloscAkcji=600;
        double cenaAkcji=21.77;
        double procentBrokera =0.02;
        double kwotaAkcje=iloscAkcji*cenaAkcji;
        double prowizja=procentBrokera*kwotaAkcje;
        double calosc = kwotaAkcje+prowizja;

        System.out.println("Kwota za same akcje: "+ kwotaAkcje);
        System.out.println("Kwota prowizjii: "+prowizja);
        System.out.println("Kwota całości: " + calosc);


    }
}