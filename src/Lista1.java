import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;

public class Lista1 {
    private final Scanner key;

    public Lista1() {
        this.key = new Scanner(System.in);
    }


    public void zad1() {
        System.out.println("Wprowadź swoje imię: ");
        String imie = this.key.nextLine();
        System.out.println("Twoje imię to: " + imie);
    }


    public void zad2() {
        String[] par = new String[8];

        final String[] Text = {
                "Wprowadź imię: ",
                "Wprowadź nazwisko: ",
                "Wprowadź wiek: ",
                "Podaj numer telefonu: ",
                "Podaj kod pocztowy ",
                "Wprowadż miejscowość zamieszkania: ",
                "Podaj rok urodzenia: ",
                "Podaj miesiąc urodzenia: "
        };

        String[] Parametry = new String[8];

        final String[] Output = {
                "Na imię masz ",
                "a na nazwisko. ",
                "masz tyle lat: ",
                "Numer Twojego telefonu to: ",
                "Kod pocztowy do miejsca Twojego zamieszkania to: ",
                "Mieszkasz w ",
                "Urodziłeś się w ",
                "miesiąca "
        };

        for (int i = 0; i < par.length; i++) {
            System.out.println(Text[i]);
            Parametry[i] = this.key.nextLine();
        }

        for (int i = 0; i < par.length; i++)
            System.out.println(Output[i] + Parametry[i]);


    }

    public void zad3() {
        int[] liczby = new int[3];
        System.out.println("Podaj trzy liczby całkowite: ");
        for (int i = 0; i < 3; i++) {
            try {
                liczby[i] = this.key.nextInt();
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


    public void zad4() {
        int[] tab = new int[5];
        System.out.println("Podaj 5 liczb całkowitych: ");
        for (int i = 0; i < tab.length; i++) {
            try {
                tab[i] = this.key.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
            }
        }
        Arrays.sort(tab);
        for (int p : tab) {
            System.out.println(p);
        }

    }

    public void zad5() {
        System.out.println("Podaj promień kuli: ");
        int r = this.key.nextInt();
        double p = 4 * PI * Math.pow(r, 2);
        double v = 4.0 / 3.0 * PI * Math.pow(r, 3);
        System.out.println("Pole kuli wynosi: ");
        System.out.format("%.2f%n", p);
        System.out.println("Objętość kuli wynosi: ");
        System.out.format("%.2f%n", v);

    }

    public void zad6() {

        boolean spr1 = false;
        boolean spr2 = false;
        double cena = 0;
        double ile = 0;
        double proc = 0;

        while (!spr1 && !spr2) {

            try {
                System.out.println("Podaj cenę towaru: ");
                cena = this.key.nextDouble();
                if (cena >= 1000 && cena <= 50000)
                    spr1 = true;
                else
                    System.out.println("Kwota musi mieścić się w przedziale od 1000zł do 50000zł.");

                System.out.println("Podaj ilość rat: ");
                ile = this.key.nextDouble();
                if (ile > 11 && ile < 49)
                    spr2 = true;
                else
                    System.out.println("Ilość rat musi mieścić się w przedziale od 12 do 48.");


            } catch (InputMismatchException e) {

                System.out.println("Niewłaściwy znak.");
                System.out.println("Chcesz spróbować ponownie? [y/n]");
                char c = this.key.next().charAt(0);
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

    public void zad7() {
        boolean exit;

        int choice = -1;
        do {
            System.out.println("][Kalkulator][" + "\nWybierz działanie: " + "\nDodawanie: 1" + "\nOdejmowanie: 2" + "\nMnożenie: 3" + "\nDzielenie: 4" + "\nExit: 0");

            try {
                System.out.println("\nPodaj numer działania: ");
                choice = this.key.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
            }

            exit = action(choice);

        } while (exit);

    }

    private boolean action(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Dziękuję za skorzystanie z kalkulatora.");
                return false;
            case 1:
                System.out.println("Podaj pierwszą liczę: ");
                int a = this.key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                int b = this.key.nextInt();
                int c = a + b;
                System.out.println("Wynik dodawania wynosi: " + c);
                break;
            case 2:
                System.out.println("Podaj pierwszą liczę: ");
                int a2 = this.key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                int b2 = this.key.nextInt();
                int c2 = a2 - b2;
                System.out.println("Wynik dodawania wynosi: " + c2);
                break;
            case 3:
                System.out.println("Podaj pierwszą liczę: ");
                int a3 = this.key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                int b3 = this.key.nextInt();
                int c3 = a3 * b3;
                System.out.println("Wynik dodawania wynosi: " + c3);
                break;
            case 4:
                System.out.println("Podaj pierwszą liczę: ");
                double a4 = this.key.nextInt();
                System.out.println("Podaj drugą liczę: ");
                double b4 = this.key.nextInt();
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

    public void zad8() {
        System.out.println("Podaj liczbę w ciągu, której wartość poznać chcesz: ");
        int n = this.key.nextInt();
        int f1 = 0;
        int f = 1;

        if (n == 0)
            System.out.println(n + " liczba w ciągu wynosi: 0");
        else if (n == 1)
            System.out.println("\n" + n + " liczba w ciągu wynosi: 1");
        else {
            for (int i = 2; i <= n; i++) {
                int m = f + f1;
                f1 = f;
                f = m;
            }

            System.out.println("\n" + n + " liczba w ciągu, wynosi: " + f);
        }
    }

    public void zad9() {

        System.out.println("Sortowanie bąbelkowe");
        System.out.println("Ile losowych liczb mam posortować?");

        int n = key.nextInt();

        int[] posortowaneBabelkowo = sortowanieBabelkowe(n, randomoweUzupelnianie(n) );
        wynik(posortowaneBabelkowo);

        int[] posortowaneWstawianie = sortowanieWstawianie(randomoweUzupelnianie(n));
        wynik(posortowaneWstawianie);

        int[] posortowaneWybieranie = sortowanieWybieranie(randomoweUzupelnianie(n));
        wynik(posortowaneWybieranie);
    }

    private void wynik(int[] tablica) {
        System.out.println("Wynik sortowania: ");
        for (int p : tablica) {
            System.out.println(p);
        }
    }

    private int[] sortowanieBabelkowe(int n, int[] tablica) {
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {

                    int temp;
                    temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;

                }
            }
            n--;
        }
        return tablica;
    }

    private int[] sortowanieWstawianie(int[] tablica) {

        for (int i = 1; i < tablica.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tablica[j] < tablica[j - 1]) {

                    int temp;
                    temp = tablica[j];
                    tablica[j] = tablica[j - 1];
                    tablica[j - 1] = temp;

                }
            }
        }
        return tablica;
    }

    private int[] randomoweUzupelnianie(int n) {
        Random rand = new Random();
        int[] tablica = new int[n];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Tak wygląda nieposortowana tablica: ");
        for (int w : tablica) {
            System.out.println(w);
        }
        return tablica;
    }

    private int[] sortowanieWybieranie(int[] tablica){

        for (int i = 0; i < tablica.length - 1; i++)
        {
            int element = i;
            for (int j = i + 1; j < tablica.length; j++)
                if (tablica[j] < tablica[element])
                    element = j;

            int mniejszyNumer = tablica[element];
            tablica[element] = tablica[i];
            tablica[i] = mniejszyNumer;
        }
        return tablica;
    }



}

