import java.util.ArrayList;
import java.util.Scanner;
public class Tasks {


    void doTask3(){
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        System.out.println("Сумма чисел в массиве: " + sumOfArray);
        System.out.println("Ср арифметическое чисел в массиве: " + sumOfArray / array.length);
    }

    void doTask4(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number = -1;
        int maxNumber = -2_147_483_647;
        int minNumber = 2_147_483_647;
        System.out.println("Вводите числа в массив. Число 0 будет считаться концом воода.");
        while (number != 0){
            number = scanner.nextInt();
            list.add(number);
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber && number!=0){
                minNumber = number;
            }
        }
        System.out.println("Максимальный элемент: " + maxNumber + " Минимальный элемент: " + minNumber);

    }

    void doTask5(String[] args){
        for (String arg: args){
            System.out.println(arg);
        }
    }

    void doTask6(){
        for (double i = 1; i < 11; i++) {
            System.out.println(1 / i);
        }
    }


}
