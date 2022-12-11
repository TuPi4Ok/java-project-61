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
        return 3;
    }
    public static int getCalc() {
        return 3;
    }
    public static int getGCD() {
        return 4;
    }
    public static int getParityCheck() {
        return 2;
    }
    public static int getPrime() {
        return 6;
    }
    public static int getProgression() {
        return 5;
    }
    public static int getHello() {
        return 1;
    }
    public static int getExit() {
        return 0;
    }
}
