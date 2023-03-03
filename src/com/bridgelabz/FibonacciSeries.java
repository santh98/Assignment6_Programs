package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, nextTerm, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(firstTerm + ", ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
