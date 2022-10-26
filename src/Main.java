import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Tasks taskRunner = new Tasks();
        //taskRunner.doTask3();
        //taskRunner.doTask4();
        //taskRunner.doTask5(args);
        //taskRunner.doTask6();
        doTask7();
    }

    static void doTask7(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = scanner.nextLong();
        number = Factorial.findFactorial(number);
        System.out.println("Факториал: " + number);

    }
}