package com.app.coffee.order.controller;

import com.app.coffee.order.services.AppService;
import com.app.coffee.order.view.AppView;

public class AppController {
    AppView view;
    AppService service;

    public AppController(AppView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        int option;
        do {
            option = view.chooseOption();
            service.filterChoice(option);
        } while (option != 0);
    }
}
