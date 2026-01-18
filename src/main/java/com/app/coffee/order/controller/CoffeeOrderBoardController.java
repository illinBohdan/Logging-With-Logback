package com.app.coffee.order.controller;

import com.app.coffee.order.exceptions.CoffeeFinishException;
import com.app.coffee.order.services.CoffeeOrderBoard;
import com.app.coffee.order.view.CreateOrderView;
import com.app.coffee.order.view.DeleteOrderByNumView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeOrderBoardController {
    private final CoffeeOrderBoard coffeeOrderBoard;
    Logger log = LoggerFactory.getLogger(CoffeeOrderBoardController.class);

    public CoffeeOrderBoardController(CoffeeOrderBoard coffeeOrderBoard) {
        this.coffeeOrderBoard = coffeeOrderBoard;
    }

    public void addOrder() {
        CreateOrderView createOrderView = new CreateOrderView();

       try {
           coffeeOrderBoard.add(createOrderView.getData());
       }catch (CoffeeFinishException e) {
           log.error(e.getMessage());
       }
    }

    public void deleteOrder() {
        coffeeOrderBoard.deliver();
    }

    public void deleteOrderByNumber() {
        DeleteOrderByNumView deleteOrderByNumView = new DeleteOrderByNumView();
        coffeeOrderBoard.deliver(deleteOrderByNumView.getData());
    }

    public void showAllOrders() {
        coffeeOrderBoard.draw();
    }
}
