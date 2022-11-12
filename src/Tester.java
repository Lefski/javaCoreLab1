import java.util.Scanner;

public class Tester {
    public static int AMOUNT_OF_OBJECTS = 3;
    public static Circle[] array = new Circle[AMOUNT_OF_OBJECTS];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Максимальное количество доступных кругов = " + AMOUNT_OF_OBJECTS);
        System.out.println("Введите данные для + " + AMOUNT_OF_OBJECTS + " кругов");
        for (int i = 0; i < AMOUNT_OF_OBJECTS; i++){
            System.out.println("Введите х: ");
            double x = scan.nextDouble();
            System.out.println("Введите y: ");
            double y = scan.nextDouble();
            System.out.println("Введите radius: ");
            double radius = scan.nextDouble();
            array[i] = new Circle(x,y,radius);
            System.out.println("Круг сохранен");
        }
        for (Circle circle: array){
            System.out.println(circle.toString());
        }



    }

}
