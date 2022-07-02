package Task2;

import java.util.ArrayList;
import java.util.Collections;

class TransformDigits {
    public static void main(String[] args) {
        transform(998);
    }

    public static void transform(int number) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayFinal = new ArrayList<>();

        int length = (int) (Math.log10(number) + 1);
        System.out.println("Before transform: " + number);

        if (number == 0) {
            System.out.print("After transform: " + 1);
        } else {
            while (number > 0) {
                array.add(number % 10);
                number /= 10;
            }
            Collections.reverse(array);
            for (int i = 0; i < length; i++) {
                int nextArray = array.get(i);
                nextArray = nextArray + 1;
                arrayFinal.add(nextArray);
            }
            System.out.print("After transform: ");
            for (int i = 0; i < length; i++) {
                int nextArrayFinal = arrayFinal.get(i);
                System.out.print(nextArrayFinal);
            }
            System.out.println();
        }
    }
}



