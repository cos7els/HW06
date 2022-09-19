import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int lines;
    private int columns;
    private int[][] array;

    public Matrix(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        array = new int[lines][columns];
    }

    public void printMatrix() {
        for (int[] i : this.array) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
    }

    public void init() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] = new Random().nextInt(10);
            }
        }
    }

    public Matrix plus(Matrix m) {
        Matrix result = new Matrix(this.lines, this.columns);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = this.array[i][j] + m.array[i][j];
            }
        }
        return result;
    }

    public void increaseByVal(int value) {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] *= value;
            }
        }
    }

    public Matrix multiple(Matrix m) {
        Matrix result = new Matrix(this.lines, m.columns);
        for (int k = 0; k < result.array.length; k++) {
            for (int i = 0; i < result.array[k].length; i++) {
                for (int j = 0; j < m.array.length; j++) {
                    result.array[k][i] += this.array[k][j] * m.array[j][i];
                }
            }
        }
        return result;
    }
}
