//PrB-4-1
//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1
//Замечание: при изменении размера матрицы бабочка должна автоматически
//масштабироваться. 

package matrixbutterfly;

public class MatrixButterfly {

    public static void main(String[] args) {
        int l = 10;
        int nxn[][] = new int[l][l];

        for (int i = 0; i <= nxn.length / 2; i++) {
            for (int j = i; j < (nxn[i].length - i); j++) {
                nxn[i][j] = 1;
            }
        }

        for (int i = nxn.length / 2; i < nxn.length; i++) {
            for (int j = nxn.length - i - 1; j <= i; j++) {
                nxn[i][j] = 1;
            }
        }
        for (int i = 0; i < nxn.length; i++) {
            for (int j = 0; j < nxn[i].length; j++) {
                System.out.print(nxn[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
