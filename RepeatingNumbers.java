import java.util.Arrays;

public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] array={1,2,3,8,3,5,5,54,7,8,9,54,11,55,55,65,915,54,3,2,2,1};
        Arrays.sort(array);
        int index=0,temp=array[0]-1;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] % 2 == 0){
                if (array[i] == array[i+1]){
                    if (array[i] != temp){
                        temp = array[i];
                        index++;
                    }
                }
            }
        }
        int[] repeatingArray = new int[index];
        temp = array[0]-1;
        index = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] % 2 == 0){
                if (array[i] == array[i+1]){
                    if (array[i] != temp){
                        temp = array[i];
                        repeatingArray[index] = temp;
                        index++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(repeatingArray));
    }
}