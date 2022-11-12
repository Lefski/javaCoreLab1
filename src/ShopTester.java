import java.util.Scanner;

public class ShopTester {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Shop test = new Shop();
    String name = ".";
    System.out.println("Введите названия компьютеров, конец строка содержащая один пробел:");
    while (!name.equals("")){
        name = scan.nextLine();
        test.computers.add(new Computer(name));
    }

}

}
