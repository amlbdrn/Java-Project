package bodrean.amalia.ex1;

import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
        System.out.print("Add 2 numbers:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b) {
            System.out.print("max is a=" + a);
        } else if (a==b) {
            System.out.print("they are equal");
        } else {
            System.out.println("max is b");
        }
}
}
