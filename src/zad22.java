public class zad22 {
    public static void main(String[] args) {
        double liczbaZakupionychAkcji =1000;
        double cena1Akcji=32.87;
        double prowizjaBankiera =0.02;
        double liczbaSprzedanychAkcji =1000;
        double cena2Akcji=33.92;
        double kwotaZaplaconaPrzezJacka=liczbaZakupionychAkcji*cena1Akcji;
        double wartoscProwizji =kwotaZaplaconaPrzezJacka*prowizjaBankiera;
        double kwotaZeSprzedaży =liczbaSprzedanychAkcji*cena2Akcji*0.98;
        double zysk =kwotaZaplaconaPrzezJacka-kwotaZeSprzedaży;
        System.out.println("kwota zapłacona przez Jacka"+kwotaZaplaconaPrzezJacka);
        System.out.println("wartosc prowizji "+wartoscProwizji);
        System.out.println("kwota otrzymana ze sprzedazy"+kwotaZeSprzedaży);
        System.out.println("zysk"+zysk);
    }
}
