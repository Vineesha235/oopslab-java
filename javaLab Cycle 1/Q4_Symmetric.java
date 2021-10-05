//Question No: 4

import java.util.Scanner;

public class Q4_Symmetric {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter no. of Rows and Columns: ");
        row = input.nextInt();
        col = input.nextInt();

        if (row == col) {
            SymMatrix matrix = new SymMatrix(row, col);

            System.out.println("Enter Elements: ");
            matrix.read();

            if (matrix.isSym())
                System.out.print("\nThe Matrix is Symmetric!");
            else
                System.out.print("\nThe Matrix is not Symmetric");
        } else {
            System.out.println("Only Square matrix can be Symmetric!");
        }
        input.close();
    }
}

class SymMatrix {
    int[][] mat;
    int row, col;
    Scanner input = new Scanner(System.in);

    SymMatrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.mat = new int[row][col];
    }

    void read() {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                this.mat[i][j] = input.nextInt();
    }

    boolean isSym() {
        boolean flag = true;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if(mat[i][j] != mat[j][i]){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
