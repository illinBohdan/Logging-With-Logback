package com.app.coffee.order.view;

import java.util.Scanner;

public class CreateOrderView {

    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть імя клієнта: ");
        return scanner.nextLine();
    }

}
