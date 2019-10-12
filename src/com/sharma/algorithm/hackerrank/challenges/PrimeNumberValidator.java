package com.sharma.algorithm.hackerrank.challenges;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumberValidator {

    private static final Scanner scanner = new Scanner(System.in);

    private static String primality(int number) {
        String result = "Prime";
        String value = "value";

        if (number < 2) {
            return "Not prime";
        }

        System.out.println(number);
        System.out.println(Math.sqrt(number));

        System.out.println(value);

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            System.out.println(divisor);
            if ((number % divisor == 0) && (divisor != number)) {
                result = "Not prime";
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter((System.getenv("OUTPUT_PATH"))));

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])");

        for(int pItr = 0; pItr < p; pItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])");

            String result = primality(n);
            System.out.println(result);
            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();
        scanner.close();
    }
}
