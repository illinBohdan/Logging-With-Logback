package com.app.coffee.order.services;

import com.app.coffee.order.controller.CoffeeOrderBoardController;
import com.app.coffee.order.view.AppView;

public class AppService {
    CoffeeOrderBoardController controller = new CoffeeOrderBoardController(new  CoffeeOrderBoard());

    public void filterChoice(int option) {
        switch (option) {
            case 1 -> controller.addOrder();
            case 2 -> controller.deleteOrder();
            case 3 -> controller.deleteOrderByNumber();
            case 4 -> controller.showAllOrders();
            case 0 -> new AppView().getOutput(Integer.toString(option));
            default -> {
                System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        }
    }
}

