package com.app.coffee.order.utils;

import com.app.coffee.order.controller.AppController;
import com.app.coffee.order.services.AppService;
import com.app.coffee.order.view.AppView;

public class AppStarter {
    public static void startApp() {
        AppService service = new AppService();
        AppView view = new AppView();
        AppController controller = new AppController(view, service);
        controller.runApp();
    }
}
