package com.app.coffee.order.services;

import com.app.coffee.order.entity.Order;
import com.app.coffee.order.exceptions.CoffeeFinishException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {

    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    private final List<Order> orders = new ArrayList<>();
    private int counter = 0;
    private static int volumeCoffee = 10;

    public void add(String name) {
        if (volumeCoffee <= 0) {
            throw new CoffeeFinishException("Кава закінчилась! Нові замовлення неможливі.");
        }
        Order order = new Order(++counter, name);
        volumeCoffee--;
        orders.add(order);
        log.info("Замовлення №{} для {} прийнято| Кави залишилось {}", counter, name, volumeCoffee);
    }

    public void deliver() {
        if (orders.isEmpty()) {
            log.warn("На даний момент замовлень немає");
        } else {
            log.info("Замовлення №{} для {} видано", orders.get(0).getNumberOfOrder(), orders.get(0).getName());
            orders.remove(0);

        }
    }

    public void deliver(int number) {
        orders.stream()
                .filter(order -> order.getNumberOfOrder() == number)
                .findFirst()
                .ifPresentOrElse(order -> {
                            orders.remove(order);
                            log.info("Замовлення №{} видано", number);
                        },
                        () -> log.warn("Замовлення з №{} відсутнє", number));
    }

    public void draw() {
        log.info("=== Поточний стан черги ===");
        log.info("№|" + "Ім'я");
        for (Order order : orders) {
            log.info("{}|{}", order.getNumberOfOrder(), order.getName());
        }
    }

}
