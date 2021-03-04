package bodrean.amalia.ex5;

import java.util.*;


public class ex5 {
    int i;

    public static void main(String[] args) {
        int nr_random, i ,j;
        Vector<Integer>numbers = new Vector<>();
        Random rand = new Random();
        System.out.print("How many elements: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (i = 0; i < n; i++) {
            nr_random = rand.nextInt(99);
            numbers.add(nr_random);
        }
        //sortare
        int aux = 0;
        for (i = 0; i < n-1; i++)
            for (j = i + 1; j < n; j++)
                if (numbers.get(i) > numbers.get(j)) {
                    aux = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, aux);
                }
        System.out.println("Vector: " + numbers);

    }
}
