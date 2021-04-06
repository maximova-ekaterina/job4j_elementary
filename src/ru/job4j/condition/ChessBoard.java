package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1) & Math.abs(y2 - y1);
        }
        if (x1 > 7 || x2 < 0 || x2 > 7 || x2 <0 || y1 > 7 || y1 < 0 || y2 > 7 || y2 < 0) {
            rsl = 0;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.way(7, 0, 0, 7);
        System.out.println(result);
    }
}
