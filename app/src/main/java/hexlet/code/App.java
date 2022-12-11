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
            switch (choice) {
                case 1 ->
                    //приветствие
                        Engine.hello();
                case 2 ->
                    //игра четность
                        ParityCheck.start();
                case 3 ->
                    //игра калькулятор
                        Calculator.start();
                case 4 ->
                    //игра НОД
                        GCD.start();
                case 5 ->
                    //игра прогрессия
                        Progression.start();
                case 6 ->
                    //игра простые числа
                        Prime.start();
                case 0 -> {
                    return;
                }
                default -> {
                    return;
                }
            }
    }
}
