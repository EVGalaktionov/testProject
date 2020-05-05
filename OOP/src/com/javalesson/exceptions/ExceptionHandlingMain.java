package com.javalesson.exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }


    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
//        PrintWriter writer = null;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
                 BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))) {
                System.out.println("Please enter numerator: ");
                int i = scanner.nextInt();
                System.out.println("Please enter denominator: ");
                int j = scanner.nextInt();
//                System.out.println(divide(i, j));
//                int[] intArray = new int[1];
//                int k = intArray[2];
//                writer = new PrintWriter(new FileWriter("output.txt"));
                writer.println("The result is: " + divide(i, j));
//                saveToFile(divide(i, j));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed.");
            } catch (IOException e) {
                System.out.println("Unable to open file.");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
//                System.out.println("All exceptions here.");
                throw new InvalidInputParamException("Index out of bound, thrown in doEverything " + e);
            } finally {
                System.out.println("'Finally' block called.");
            }
            System.out.println("Try-catch block ended.");
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return (numerator / denominator);
    }

    private static void saveToFile(int divide) throws IOException {

    }
}
