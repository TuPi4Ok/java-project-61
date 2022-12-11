package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.GCD;
import hexlet.code.games.Calculator;
import hexlet.code.games.ParityCheck;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                    Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
                    5 - Progression
                    6 - Prime
                    0 - Exit
                    Your choice:\s""");
        var choice = Integer.parseInt(scanner.next());
        System.out.print("\n");
        final var case0 = 0;
        final var case1 = 1;
        final var case2 = 2;
        final var case3 = 3;
        final var case4 = 4;
        final var case5 = 5;
        final var case6 = 6;
        if (choice == case1) {
            //приветствие
            Engine.hello();
        } else if (choice == case2) {
            //игра четность
            ParityCheck.start();
        } else if (choice == case3) {
            //игра калькулятор
            Calculator.start();
        } else if (choice == case4) {
            //игра НОД
            GCD.start();
        } else if (choice == case5) {
            //игра прогрессия
            Progression.start();
        } else if (choice == case6) {
            //игра простые числа
            Prime.start();
        } else if (choice == case0) {
            return;
        }
        return;
    }
}
