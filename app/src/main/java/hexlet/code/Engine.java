package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String hello() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("\nHello, " + name + "!");
        return name;
    }
    public static int getGameValue() {
        final var gameValue = 3;
        return gameValue;
    }
}
