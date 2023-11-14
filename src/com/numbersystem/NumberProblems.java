package com.numbersystem;

import java.util.ArrayList;
import java.util.List;

public class NumberProblems {
    public static int countNumberOfDigitsOfGivenNumber(int num) {
        int count = 0;
        while (num>0) {
            num = num/10;
            count++;
        }
        return count;
    }

    public static int sumOfDigitsOfNumber(int num) {
        int count = 0;
        int sum = 0;
        while (num>0) {
            sum += num%10;
            num = num/10;
            count++;
        }
        return sum;
    }

    public static List<Integer> findDivisorsOfNumber(int n) {
        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        divisors.add(n);
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                divisors.add(i);
                divisors.add(n/i);
            }
        }
        return divisors;
    }

    public static int reversNumber(int n) {
        int reversedNumber = 0;
        while (n!=0) {
            int lastDigit = n%10;
            reversedNumber = reversedNumber*10 + lastDigit;
            n=n/10;
        }
        return reversedNumber;
    }

    public static boolean isPrimeNumber(int num) {
        for (int i =2; i<=Math.sqrt(num); i++) {
            if (num%i==0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1231;
        int digits = countNumberOfDigitsOfGivenNumber(number);
        System.out.println("total Digits of "+number+ " is = "+digits);

        int sumOfDigits = sumOfDigitsOfNumber(number);
        System.out.println("Sum of All Digits of "+number+ " is = "+sumOfDigits);

        List<Integer> divisors = findDivisorsOfNumber(number);
        System.out.println("Dividers of given of "+number+ " is = "+ divisors);

        int reversedNumber = reversNumber(number);
        System.out.println("reversed of "+number+ " is = "+reversedNumber);

        boolean isPrimeNumber = isPrimeNumber(number);
        System.out.println("is "+ number + " prime number = "+isPrimeNumber);

    }
}
