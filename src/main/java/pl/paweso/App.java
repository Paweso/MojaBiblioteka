package pl.paweso;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("|                                     |");
        System.out.println("| Witaj w programie *Moja Biblioteka* |");
        System.out.println("|                                     |");
        System.out.println("|               ver 1.0               |");
        System.out.println("|                                     |");
        System.out.println("|         by Paweł Wesołowski         |");
        System.out.println("|                                     |");
        System.out.println("---------------------------------------\n\n\n");

        System.out.println("Wybierz opcję:");
        System.out.println("0. Wyjście");
        System.out.println("1. Wprowadź dane książki");
        System.out.println("2. Wprowadź dane użytkownika");

        Scanner scanner = new Scanner(System.in);

        int selectOption = scanner.nextInt();

        if (selectOption == 1)
            System.out.println("wybrano opcję 1.");
        else if (selectOption == 2)
            System.out.println("wybrano opcję 2");
        else if (selectOption == 0)
            System.out.println("wybrano opcję 0.");
        else
            System.out.println("nie ma takiej opcji");



    }
}
