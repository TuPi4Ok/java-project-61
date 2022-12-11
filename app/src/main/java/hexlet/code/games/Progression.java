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

        for (int i = 0; i < Engine.getGameValue(); i++) {
            var lowIndex0 = 0;
            var lowIndex5 = 5;
            var heightIndex10 = 10;
            var heightIndex30 = 30;
            var heightIndex1 = 1;
            var n = random.nextInt(lowIndex5, heightIndex10);
            var prog = new int[n];
            var step = random.nextInt(heightIndex1, heightIndex10);
            var concealment = random.nextInt(lowIndex0, n);
            prog[0] = random.nextInt(lowIndex0, heightIndex30);

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
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '");
                System.out.print(prog[concealment] + "'.\n");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }
}
