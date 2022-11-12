
import java.util.ArrayList;
import java.util.Scanner;

public class CircleTester {

    public static ArrayList <Circle> circleArrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемое количество кругов: ");
        int amount = scan.nextInt();
        for (int i = 0;i<amount; i++ ){
            setCircle();
        }

        for (Circle circle : circleArrayList) {
            System.out.println(circle.toString());
        }
    }

    public static void setCircle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х: ");
        double x = scan.nextDouble();
        System.out.println("Введите y: ");
        double y = scan.nextDouble();
        System.out.println("Введите radius: ");
        double radius = scan.nextDouble();
        circleArrayList.add(new Circle(x,y,radius));
        System.out.println("Круг сохранен");
    }

}
