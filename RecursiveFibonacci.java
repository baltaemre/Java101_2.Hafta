import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibonacci(int step){
        if (step == 1 || step == 2)
            return 1;

        return fibonacci(step-1)+fibonacci(step-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int step;

        System.out.print("Terim sayısı : ");
        step = input.nextInt();
        System.out.println("Fibonacci serisinin "+step+". elamanı = "+fibonacci(step));
    }
}