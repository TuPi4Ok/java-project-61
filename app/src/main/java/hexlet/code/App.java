package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var exit = true;
        while (exit) {
            System.out.println("Please enter the game number and press Enter.\n"
                    + "1 - Greet\n"
                    + "2 - Even\n"
                    + "3 - Calc\n"
                    + "0 - Exit\n"
                    + "Your choice:");
            var choice = Integer.parseInt(scanner.next());

            switch (choice) {
                case 1:
                    //приветствие
                    Engine.hello();
                    break;
                case 2:
                    //игра четность
                    ParityCheck.start();
                    break;
                case 3:
                    //игра калькулятор
                    Calculator.start();
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    break;
            }
        }
    }
}
