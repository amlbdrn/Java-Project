package bodrean.amalia.ex2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){
        System.out.print("Add a variable:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        PrintNumberInWord(x);
    }

    public static void PrintNumberInWord(int var) {

        switch(var){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHt");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");


        }
    }

}
