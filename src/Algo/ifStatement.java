package Algo;

import java.util.Scanner;

public class ifStatement {

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number > 7)
            System.out.println("Hello");


    }
}
