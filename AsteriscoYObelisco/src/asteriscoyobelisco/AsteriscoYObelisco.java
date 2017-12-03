package asteriscoyobelisco;

public class AsteriscoYObelisco {

    public static void main(String[] args) {

        int maxRow;
        int maxCol;
        int base;

        maxRow = 4;
        maxCol = 1;
        base = 4;

        triangulo3v2(base);
    }

    private static void cuadrado(int maxRow, int maxCol) {
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangulo1(int base) {
        for (int row = 0; row < base; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangulo1v2(int base) {
        for (int row = 0; row < base; row++) {
            int col = 0;

            for (; col < (base - 1) - row; col++) {
                System.out.print("");
            }
            for (; col < base; col++) {
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

    private static void triangulo3(int base) {
        for (int row = base; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangulo3v2(int base) {
        for (int row = base; row > 0; row--) {
            int col = 0;

            for (; col < (base) - row; col++) {
                System.out.print("");
            }
            for (; col < base; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangulo4(int base) {
        for (int row = base; row > 0; row--) {
            int col = 0;

            for (; col < (base) - row; col++) {
                System.out.print(" ");
            }
            for (; col < base; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
