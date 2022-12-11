package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void start() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        var name = Engine.hello();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.getGameValue(); i++) {
            var lowIndex = 2;
            var heightIndex = 100;
            var num1 = random.nextInt(lowIndex, heightIndex);
            var num2 = random.nextInt(lowIndex-1, num1);
            System.out.print("Question: " + num1 + " " + num2 + "\n"
                    + "Your answer: ");
            var answer = scanner.nextInt();

            if (answer == findGCD(num1, num2)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + findGCD(num1, num2) + "'.\n");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }

    public static int findGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        } else {
            var perehod = num1 % num2;
            num1 = num2;
            num2 = perehod;
            return findGCD(num1, num2);
        }
    }
}
