import java.util.Scanner;

public class Menu {
    boolean exit;
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();
    }
    public void runMenu(){
        header();
        while(!exit){
            options();
            int choice = choice();
            action(choice);
        }
    }
    private void header(){
        System.out.println("*--------------------------*");
        System.out.println("|           Menu           |");
        System.out.println("|    Lista zadań numer 1   |");
        System.out.println("*--------------------------*");
    }

    private void options(){
        System.out.println("\nWybierz zadanie:");
        System.out.println("1) Zadanie 1");
        System.out.println("2) Zadanie 2");
        System.out.println("3) Zadanie 3");
        System.out.println("4) Zadanie 4");
        System.out.println("5) Zadanie 5");
        System.out.println("6) Zadanie 6");
        System.out.println("7) Zadanie 7");
        System.out.println("8) Zadanie 8");
        System.out.println("9) Zadanie 9");
        System.out.println("0) Exit");
    }

    private int choice(){
     Scanner key = new Scanner(System.in);
     int choice = -1;
     while(choice < 0 || choice >9){
         try{
             System.out.println("\nPodaj numer zadania: ");
             choice = key.nextInt();
         }
         catch (NumberFormatException e){
             System.out.println("Wprowadzono zły znak, spróbuj ponownie.");
         }
     }
        return choice;
    }

    private void action(int choice){
        switch(choice){
            case 0:
                exit = true;
                System.out.printf("Dziękuję za skorzystanie z mojego programu.");
                break;
            case 1:
                Zad1.zad1();
                break;
            case 2:
                Zad1.zad2();
                break;
            case 3:
                Zad1.zad3();
                break;
            case 4:
                System.out.printf("Test zad 4");
                break;
            case 5:
                System.out.printf("Test zad 5");
                break;
            case 6:
                System.out.printf("Test zad 6");
                break;
            case 7:
                System.out.printf("Test zad 7");
                break;
            case 8:
                System.out.printf("Test zad 8");
                break;
            case 9:
                System.out.printf("Test zad 9");
                break;
                default:
                    System.out.println("Wystąpił nieznany błąd.");
        }
    }
}
