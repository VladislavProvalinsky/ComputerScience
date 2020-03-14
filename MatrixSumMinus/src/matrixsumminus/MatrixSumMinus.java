//PrB-4-3
//Написать программу выполняющее поэлементное вычитание и поэлементное сложение
//одной матрицы размерности MxN и другой матрицы той же самой размерности. Пример
//поэлементного вычитания/сложения: 

package matrixsumminus;

public class MatrixSumMinus {

    public static void main(String[] args) {
        int m = 7;
        int n = 7;
        int mas1[][] = new int[m][n];
        int mas2[][] = new int[m][n];
        int mas3[][] = new int[m][n];
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                mas1[i][j] = (int) (Math.random() * 10);
                System.out.print(mas1[i][j] + " ");
            }
            System.out.print(" +  ");
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = (int) (Math.random() * 10);
                System.out.print(mas2[i][j] + " ");
            }
            System.out.print(" =  ");
            for (int j = 0; j < mas2[i].length; j++) {
                mas3[i][j] = mas1[i][j] + mas2[i][j];
                System.out.print(mas3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
