package com.patterns;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatternQuestion {

    private static void printButterFly(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printRightSideTriangle(int n) {
        for (int i=1; i<=n; i++) {
            for (int a =1; a<=i; a++) {
                System.out.print(" ");
            }
            for (int a =i; a<=n; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static String getFullName(String fName, String mName, String lName) {
        return Stream.of(fName, mName, lName)
                .filter(ele -> ele!=null ||ele.isEmpty())
                .collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        int n = 4;
//        printRightSideTriangle(n);
        printButterFly(4);
        String fName = "Bhushan";
        String mName = "sfdfs";
        String lName = "";
        System.out.println(getFullName(fName, mName, lName));
    }
}

