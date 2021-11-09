import java.util.Scanner;

public class MinimumElement {



    private static int readInteger(){

        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.close();
        return capacity;
    }

    private static int[] readElements(int elementCount){
        int[] elements = new int[elementCount];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < elementCount; i++){
            elements[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return elements;
    }

    private static int findMin(int[] elements){
        int minNum = elements[0];
        for (int i = 1; i < elements.length; i++){
            if(elements[i] < minNum){
                minNum = elements[i];
            }
        }
        return minNum;
    }
}
