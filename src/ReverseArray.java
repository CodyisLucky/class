import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] arrayForward){
        int length = arrayForward.length;
        int[] arrayBack = new int[length];
        for(int i = 0; i < length; i++){
            arrayBack[i] = arrayForward[length-(i+1)];
        }
        System.out.println("Array = " + Arrays.toString(arrayForward));
        System.out.println("Reversed array = " + Arrays.toString(arrayBack));
    }
}
