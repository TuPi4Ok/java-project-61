package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void start() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        var name = Engine.hello();

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            var num1 = random.nextInt(0, 100);
            var num2 = random.nextInt(0, 100);
            var oper = random.nextInt(0, 2);
            if (oper == 0)
                System.out.println("Question:" + num1 + " + " + num2 + "\n"
                        + "Your answer: ");
            else if (oper == 1)
                System.out.println("Question:" + num1 + " - " + num2 + "\n"
                        + "Your answer: ");
            else
                System.out.println("Question:" + num1 + " * " + num2 + "\n"
                        + "Your answer: ");

            var answer = scanner.nextInt();
            if (num1 + num2 == answer && oper == 0 || num1 - num2 == answer && oper == 1 || num1 * num2 == answer && oper == 2)
                System.out.println("Correct!");
            else {
                var otvet = oper == 0 ? num1 + num2 : oper == 1 ? num1 - num2 : num1 * num2;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + otvet + "'.\n"
                        + "Let's try again, " + name + "!");
                break;
            }
            if (i == 2)
                System.out.println("Congratulations, " + name + "!");
        }
    }
}
