import java.util.Arrays;
import java.util.Scanner;

public class HarmonicAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dimension,numberElements;
        double sum=0.0, average;

        System.out.print("Dizi kaça elemanlı olacak : ");
        numberElements = input.nextInt();

        double[] array = new double[numberElements];
        for (int i=0;i<array.length;i++){
            System.out.print(i+". elamanı giriniz: ");
            array[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(array));

        // harmonic series
        for (int j=0; j<array.length;j++)
            sum += 1 / array[j];

        // Harmonic Average
        average = array.length / sum;
        System.out.println("Harmonik ortalama = "+average);

    }
}