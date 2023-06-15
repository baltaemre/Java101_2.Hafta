import java.util.Arrays;
import java.util.Scanner;

public class SortingInArrays {
    static int[] sortArray(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    static void printArray(int[] array){
        System.out.print("Sıralama : ");
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimension;

        System.out.print("Dizinin boyutu n : ");
        dimension = input.nextInt();

        int[] array = new int[dimension];
        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0; i < dimension; i++) {
            System.out.print((i+1)+". Elemanı : ");
            array[i] = input.nextInt();
        }

        array = sortArray(array);
        printArray(array);
    }
}