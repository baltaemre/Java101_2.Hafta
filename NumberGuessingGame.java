import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int right=5, value, guess;
        int[] wrong = new int[5];
        boolean isWrong = false;

        guess = rand.nextInt(100);
        System.out.println("tahmini : "+guess);


        do {
            System.out.print("Tahmin değereinizi giriniz : ");
            value = input.nextInt();

            if (value < 0 || value > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right--;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (value == guess){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + guess);
                break;
            }else {
                System.out.println("Hatalı tahmin yaptınız !");
                if (value > guess)
                    System.out.println(value + " sayısı, gizli sayıdan büyüktür.");
                else
                    System.out.println(value + " sayısı, gizli sayıdan küçüktür.");
                wrong[5-right] = value;
                right--;
                System.out.println("kalan hakkınız : "+right);
            }

        }while (right>0);

        if (right == 0) {
            System.out.println("Kaybettiniz !!!");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }

    }
}

