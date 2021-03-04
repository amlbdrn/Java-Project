package bodrean.amalia.ex7;

import java.util.Scanner;
import java.util.Random;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr;
        System.out.println("Guess the number \n");
        Random ran = new Random();
        int x=ran.nextInt(10);
        int is_guessed = 0;
        int guess = 0;
        while(is_guessed==0 && guess<=3)
            guess++;
        nr=in.nextInt();
        if(nr < x)
            System.out.println("Wrong\nNumber too low\n");
        else if(nr > x)
            System.out.println("Wrong\nNumber too high\n");
        else if (nr == x)
            is_guessed = 1;
    }
}
