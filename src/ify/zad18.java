package ify;
import java.util.Scanner;
public class zad18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String restauracja1, restauracja2, restauracja3, restauracja4, restauracja5;

        restauracja1 = "luksusowe burgery u Jarka";
        restauracja2 = "Pizzeria przy Dworcowej";
        restauracja3 = "Kawiarnia na Rogu";
        restauracja4 = "Wloskie Specjaly";
        restauracja5 = "Kuchnia u Szefa";
        restauracja4 = "Wloskie Specjaly";
        char weganskie, wegetarianskie, bezglutenowe;

        System.out.println(" jestes wegetarian? T czy N?");
        wegetarianskie = scanner.next().charAt(0);

        System.out.println("jestes wegan? T czy N?");
        weganskie = scanner.next().charAt(0);

        System.out.println("jestes bezglutenowcem? T czy N?");
        bezglutenowe = scanner.next().charAt(0);
        System.out.println(" mozecie isc do tych restauracji");

        if (wegetarianskie =='N'&& weganskie=='N'&& bezglutenowe=='N' )
        {
            System.out.println(" masz do wyboru:"+ restauracja1);
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja5);

        }
        else if (weganskie =='T'&& wegetarianskie=='N'&& bezglutenowe=='N' )
        {
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }
        else if (weganskie =='N'&& wegetarianskie=='N'&& bezglutenowe=='T' )
        {
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja3);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }

        else if (weganskie =='T'&& wegetarianskie  =='T'&& bezglutenowe=='T' )
        {
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja3);
            System.out.println(" masz do wyboru:"+ restauracja5);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }
        else if (weganskie =='N'&& wegetarianskie=='T'&& bezglutenowe=='N' )
        {
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja3);
            System.out.println(" masz do wyboru:"+ restauracja5);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }
        else if (weganskie =='T'&& wegetarianskie=='T'&& bezglutenowe=='N' )
        {
            System.out.println(" masz do wyboru:"+ restauracja3);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }
        else if (weganskie =='N'&& wegetarianskie=='T'&& bezglutenowe=='T' )
        {
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja3);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }
        else if (weganskie=='T'&& wegetarianskie=='N'&& bezglutenowe=='T' )
        {
            System.out.println(" masz do wyboru:"+ restauracja2);
            System.out.println(" masz do wyboru:"+ restauracja3);
            System.out.println(" masz do wyboru:"+ restauracja4);
        }

    }

}