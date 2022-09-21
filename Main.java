package snake;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        try {
            Application.launch(snake.class, args);
        } catch (UnsupportedOperationException e) {
            System.out.print(e);
            System.err.println("Program is closing");
            System.exit(1);
        }
    }
}
