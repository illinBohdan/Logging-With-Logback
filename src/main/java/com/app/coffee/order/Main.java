package com.app.coffee.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(Main.class);

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        CoffeeOrderBoard coffeeOrderBoard2 = new CoffeeOrderBoard();
        CoffeeOrderBoard coffeeOrderBoard3 = new CoffeeOrderBoard();
        try {
            coffeeOrderBoard.add("Вася");
            coffeeOrderBoard.add("Петя");
            coffeeOrderBoard.add("Коля");
            coffeeOrderBoard.add("Оля");
            coffeeOrderBoard.add("Саша");
            coffeeOrderBoard.add("Галя");
            coffeeOrderBoard.add("Толя");
            coffeeOrderBoard.add("Інна");
        }catch (CoffeeFinishException e){
            log.error(e.getMessage());

        }

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(10);
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.add("Аня");
        coffeeOrderBoard.deliver(7);


        coffeeOrderBoard.draw();

        try {
            coffeeOrderBoard2.add("Максим");
            coffeeOrderBoard2.add("Тимофій");
            coffeeOrderBoard2.add("Олександр");
            coffeeOrderBoard2.add("Мирослав");
            coffeeOrderBoard2.add("Тетяна");
        }catch (CoffeeFinishException e){
            log.error(e.getMessage());
        }
        coffeeOrderBoard2.draw();

        coffeeOrderBoard3.deliver();
    }
}
