import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class Zad1 {

    public static void zad1() {
        Scanner key = new Scanner(System.in);
        System.out.println("Wprowadź swoje imię: ");
        String imie = key.nextLine();
        System.out.println("Twoje imię to: " + imie);
    }


    public static void zad2() {
        String[] par = new String[]{"", "", "", "", "", "", "", ""};
        for (int i = 0; i < par.length; i++) {
            Scanner key = new Scanner(System.in);
            System.out.println("Wprowadź imię kolegów/koleżanek z klasy: ");
            par[i] = key.nextLine();
        }
        for (int i = 0; i < par.length; i++)
            System.out.println("Imiona Twoich kolegów i koleżanek to: " + par[i]);


    }

    public static void zad3() {
        Scanner key = new Scanner(System.in);
        int[] liczby = new int[3];
        System.out.println("Podaj trzy liczby całkowite: ");
        for (int i = 0; i < 3; i++) {
            try {
                liczby[i] = key.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
            }
        }
        if (liczby[0] > liczby[1] && liczby[0] > liczby[2])
            System.out.println("Największa spośród podanych liczb to: " + liczby[0]);
        else if (liczby[1] > liczby[0] && liczby[1] > liczby[2])
            System.out.println("Największa spośród podanych liczb to: " + liczby[1]);
        else if (liczby[2] > liczby[0] && liczby[2] > liczby[1])
            System.out.println("Największa spośród podanych liczb to: " + liczby[2]);

    }


    public static void zad4() {
        Scanner key = new Scanner(System.in);
        int[] tab = new int[5];
        System.out.println("Podaj 5 liczb całkowitych: ");
        for (int i = 0; i < tab.length; i++) {
            try {
                tab[i] = key.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
            }
        }
        Arrays.sort(tab);
        for (int p : tab) {
            System.out.println(p);
        }

    }

    public static void zad5() {
        Scanner key = new Scanner(System.in);
        System.out.println("Podaj promień kuli: ");
        int r = key.nextInt();
        double p = 4 * PI * Math.pow(r, 2);
        double v = 4 / 3 * PI * Math.pow(r, 3);
        System.out.println("Pole kuli wynosi: ");
        System.out.format("%.2f%n", p);
        System.out.println("Objętość kuli wynosi: ");
        System.out.format("%.2f%n", v);

    }

    public static void zad6() {
        Scanner key = new Scanner(System.in);

        boolean spr1 = false;
        boolean spr2 = false;
        double cena = 0;
        double ile = 0;
        double proc = 0;

        while (!spr1 && !spr2) {

            try {
                System.out.println("Podaj cenę towaru: ");
                cena = key.nextDouble();
                if (cena >= 1000 && cena <= 50000)
                    spr1 = true;
                else
                    System.out.println("Kwota musi mieścić się w przedziale od 1000zł do 50000zł.");

                System.out.println("Podaj ilość rat: ");
                ile = key.nextDouble();
                if (ile > 11 && ile < 49)
                    spr2 = true;
                else
                    System.out.println("Ilość rat musi mieścić się w przedziale od 12 do 48.");


            } catch (InputMismatchException e) {

                System.out.println("Niewłaściwy znak.");
                System.out.println("Chcesz spróbować ponownie? [y/n]");
                char c = key.next().charAt(0);
                if (c == 'n') {
                    spr1 = true;
                    spr2 = true;
                }

            }
        }

        if (ile > 0 && ile <= 12) proc = 0.03;
        else if (ile > 12 && ile <= 24) proc = 0.06;
        else if (ile > 24 && ile <= 48) proc = 0.1;

        double rata = cena * proc / ile;
        System.out.println("Miesięczna rata wynosi: ");
        System.out.format("%.2f%n", rata);

    }

    public static void zad7() {
        boolean exit =false;
        Scanner key = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("][Kalkulator][" + "\nWybierz działanie: " + "\nDodawanie: 1" + "\nOdejmowanie: 2" + "\nMnożenie: 3" + "\nDzielenie: 4" + "\nExit: 0");

            try {
                System.out.println("\nPodaj numer działania: ");
                choice = key.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
            }

            exit = action(choice);

        } while (exit);

    }

    private static boolean action(int choice) {
        Scanner key = new Scanner(System.in);
        switch (choice) {
            case 0:
                System.out.printf("Dziękuję za skorzystanie z kalkulatora.");
                return false;
            case 1:
                System.out.println("Podaj pierwszą liczę: ");
                int a = key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                int b = key.nextInt();
                int c = a + b;
                System.out.println("Wynik dodawania wynosi: " + c);
                break;
            case 2:
                System.out.println("Podaj pierwszą liczę: ");
                int a2 = key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                int b2 = key.nextInt();
                int c2 = a2 - b2;
                System.out.println("Wynik dodawania wynosi: " + c2);
                break;
            case 3:
                System.out.println("Podaj pierwszą liczę: ");
                int a3 = key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                int b3 = key.nextInt();
                int c3 = a3 * b3;
                System.out.println("Wynik dodawania wynosi: " + c3);
                break;
            case 4:
                System.out.println("Podaj pierwszą liczę: ");
                double a4 = key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                double b4 = key.nextInt();
                if (b4 == 0)
                    System.out.println("Nie dzielimy przez 0!");
                double c4 = a4 / b4;
                System.out.println("Wynik dodawania wynosi: ");
                System.out.format("%.2f%n", c4);
                break;
            default:
                System.out.println("Wystąpił nieznany błąd.");
        }
        return true;

    }

    public static void zad8(){
        System.out.println("Ciąg Fibonaciego");
    }

    public static void zad9(){
        System.out.println("Sortowanie");
    }
}
