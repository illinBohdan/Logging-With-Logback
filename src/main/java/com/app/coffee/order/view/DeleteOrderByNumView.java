package com.app.coffee.order.view;

import java.util.Scanner;

public class DeleteOrderByNumView {

    public int getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер замовлення: ");
        return scanner.nextInt();
    }
}
