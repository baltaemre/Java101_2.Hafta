import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int number){
        int temp = number,remainder,newNumber=0;
        while (temp != 0){
            remainder = temp % 10;
            newNumber = newNumber*10+remainder;
            temp /= 10;
        }
        if (newNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        boolean station;

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();
        station = isPalindrome(number);

        if (station)
            System.out.println(number+" Palindrom sayıdır");
        else
            System.out.println(number+" Palindrom sayı değildir");
    }
}