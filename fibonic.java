package com.bl.reviewsession;

public class fibonic {

        public static void main(String[] args) {
            int n = 10; // set the number of terms to generate
            int firstTerm = 0, secondTerm = 1;
            System.out.print("Fibonacci Series of " + n + " terms:");

            for (int i = 1; i <= n; i++) {
                System.out.print(firstTerm + " ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }

