import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20,30,50,30,25};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int temp = array[0], repeating=1;
        System.out.println("Tekrar Sayıları");

        for (int i = 1; i < array.length; i++){
                if (array[i] == array[i-1]){
                    repeating++;
                    temp = array[i];
                    if (i == array.length-1){
                        System.out.println(temp+" sayısı "+repeating+" kere tekrar edildi.");
                    }
                }else{
                    System.out.println(temp+" sayısı "+repeating+" kere tekrar edildi.");
                    repeating = 1;
                    temp = array[i];
                    if (i == array.length-1){
                        System.out.println(temp+" sayısı "+repeating+" kere tekrar edildi.");
                    }
                }
        }
    }
}
