import java.util.Scanner;

public class PatternCreation {
    static void pattern(int number, int temp, int sign) {

        if (temp>number)
            return;
        if (temp<=0)
            sign = 1;

        System.out.print(temp + " ");
        temp += sign*5;
        pattern(number,temp,sign);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int number = input.nextInt();

        pattern(number,number,-1);
    }
}