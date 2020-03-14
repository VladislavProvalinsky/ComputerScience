//PrB-4-4
//Написать программу выполняющую матричное произведение двух заданных
//прямоугольных матриц

package matrixmultiplication;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int x = 2;
        int mas1[][] = new int[m][n];
        int mas2[][] = new int[n][x];
        int mas3[][] = new int[m][x];
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                mas1[i][j] = (int) (Math.random() * 10);
                System.out.print(mas1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*");
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = (int) (Math.random() * 10);
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < x; j++) {
                for (int a = 0; a < n; a++) {
                    mas3[i][j] += mas1[i][a] * mas2[a][j];
                }
                System.out.print(mas3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}