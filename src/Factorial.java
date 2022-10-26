public class Factorial {

    static long findFactorial(long number){
        long factorial = 1;
        for (int i = 2;i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}
