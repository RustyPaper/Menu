import java.util.Scanner;

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
        for (int i=0; i<3; i++){
            try{
                liczby[i] = key.nextInt();
            }
            catch (NumberFormatException e){
                System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
            }
        }
        if (liczby[0]<liczby[2] || liczby[0]<liczby[2])
            System.out.println("Największa spośród podanych liczb to: "+liczby[0]);
        else if (liczby[1]<liczby[0] || liczby[1]<liczby[2])
            System.out.println("Największa spośród podanych liczb to: "+liczby[1]);
        else if (liczby[2]<liczby[1] || liczby[2]<liczby[1])
            System.out.println("Największa spośród podanych liczb to: "+liczby[2]);

    }
}