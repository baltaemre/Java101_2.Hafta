import java.util.Scanner;
import java.util.Arrays;

public class NearestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = {15,12,788,1,-1,-778,2,0};
        int number, min=0, max=0;

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        System.out.println("Dizi : "+Arrays.toString(array));
        System.out.println("Girilen Sayı : "+number);

        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            if (array[i]<number)
                min = array[i];
            if (array[i]>number){
                max = array[i];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);

    }
}