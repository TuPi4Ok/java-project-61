package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class ParityCheck {
    public static void start() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        var name = Engine.hello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            var num = random.nextInt(0, 100);
            System.out.print("Question: " + num + "\n"
                    + "Your answer: ");

            var answer = scanner.next();

            if (num % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (num % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + name + "!");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " + name + "!");
                    break;
                }
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
