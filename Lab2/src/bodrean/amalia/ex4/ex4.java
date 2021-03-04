package bodrean.amalia.ex4;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        int i, max = 0;
        int[] numbers = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.print("How many elements: ");
        int n = in.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Add the elements: ");
            for (i = 0; i < n; i++) {
                System.out.print("v[" + i + "]= ");
                int y = in.nextInt();
                numbers[i] = y;
            }

            for (i = 0; i < n; i++) {

                if (max < numbers.get(i)) {
                    max = numbers.get(i);
                }
            }
        }


    }
}
