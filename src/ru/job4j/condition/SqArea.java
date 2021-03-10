package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        return ((p/(2*(k+1)))*k)*(p/(2*(k+1)));
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}

