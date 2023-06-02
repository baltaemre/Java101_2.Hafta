import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        if (isPrime(number,number/2))
            System.out.println(number+" sayısı ASALDIR !");
        else
            System.out.println(number+" sayısı ASAL değildir !");
    }
    static boolean isPrime(int number,int index){
        if (index == 1)
            return true;
        if (number % index == 0)
            return false;

        return isPrime(number,index-1);
    }
}