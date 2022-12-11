package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void start() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        var name = Engine.hello();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < Engine.getGameValue(); i++) {
            final var lowIndex = 0;
            final var heightIndex = 100;
            var num = random.nextInt(lowIndex, heightIndex);
            System.out.print("Question: " + num + "\n"
                    + "Your answer: ");
            var answer = scanner.next();

            if (isPrime(num) && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (!isPrime(num) && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + name + "!");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " + name + "!");
                }
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
