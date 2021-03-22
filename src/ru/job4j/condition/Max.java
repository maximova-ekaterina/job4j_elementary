package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = left > right;
        int result = max ? left : right;
        return result;

    }

    public static void main(String[] argf) {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        System.out.println(result);
    }
}
