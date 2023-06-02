import java.util.Scanner;

public class RecursiveExponentialNumber {
    static int power(int base,int exponent){
        if (exponent == 0)
            return 1;

        exponent--;
        return base*power(base,exponent);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base,exponent;

        System.out.print("Taban değeri giriniz : ");
        base = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        exponent = input.nextInt();

        System.out.println("Sonuç : "+power(base,exponent));
    }
}