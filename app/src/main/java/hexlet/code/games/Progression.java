package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void start() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        var name = Engine.hello();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < 3; i++) {
            var n = random.nextInt(5, 10);
            var prog = new int[n];
            var step = random.nextInt(1, 10);
            var concealment = random.nextInt(0, n);
            prog[0] = random.nextInt(0, 30);

            for (int j = 1; j < n; j++) {
                prog[j] = prog[j - 1] + step;
            }

            System.out.print("Question: ");
            for (int j = 0; j < n; j++) {
                if (j == concealment) {
                    System.out.print(".. ");
                } else {
                    System.out.print(prog[j] + " ");
                }
            }

            System.out.print("\n");
            var answer = scanner.nextInt();

            if (answer == prog[concealment]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + prog[concealment] + "'.\n"
                        + "Let's try again, " + name + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }
}