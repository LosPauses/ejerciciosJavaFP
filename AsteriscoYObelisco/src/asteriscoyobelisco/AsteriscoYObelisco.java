package asteriscoyobelisco;

import java.util.Scanner;

public class AsteriscoYObelisco {

    public static void main(String[] args) {

        int maxRow;
        int maxCol;
        int base;

        maxRow = 4;
        maxCol = 1;
        base = 4;

        triangulo2(base);
    }

    private static void cuadrado(int maxRow, int maxCol) {
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangulo(int base) {
        for (int row = 0; row < base; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangulo2(int base) {
        for (int row = 0; row < base; row++) {
            int col = 0;

            for (; col < (base - 1) - row; col++) {
                System.out.print("-");
            }
            for (; col < base; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
