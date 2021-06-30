package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] yes = new int[size][size];
        for (int i = 0; i < yes.length; i++) {
            for (int j = 0; j < yes[i].length; j++) {
                yes[i][j] = (i + 1) * (j + 1);
            }
        }
        return yes;
    }
}
