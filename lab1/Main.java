package lab1;

import lab1.controller.Controller;
import lab1.model.Number;
import lab1.view.View;

public class Main {
    public static void main (String []args) {
        Number number = new Number();
        View view = new View();
        Controller controller = new Controller(number, view);

        controller.processConversion();
    }
}
