package com.app.coffee.order.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    Scanner scanner;
    int option;

    public int chooseOption() {
        scanner = new Scanner(System.in);
        showMenu();

        option = scanner.nextInt();

        return option;
    }

    private void showMenu() {
        System.out.print("""
                
                ______ MENU ___________
                1 - Створити замовлення.
                2 - Видалити замовлення.
                3 - Видати замовлення за номером.
                4 - Черга замовлень.
                0 - Close the App.
                """);
        System.out.print("Input option: ");
    }

    public void getOutput(String output) {
        if (output.equals("0")) {
             System.out.println("До побачення");
            System.exit(0);
        } else System.out.println(output);
    }

}
