package com.example.matrixsolver.matrix.math;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.ExemptionMechanismException;

public class IntMatrix {

    /*
     * https://en.wikipedia.org/wiki/Matrix_(mathematics)
     */

    int size = 0;
    int element = 0;
    int[][] matrix;

    /**
     * Initializes an empty matrix.
     */
    public IntMatrix() {
        this(new int[0][0]);
    }

    public IntMatrix(int[][] initMatrix) {
        matrix = initMatrix;
    }

    /**
     * Returns the value at position (row, col).
     *
     * @param row Specifies the row number of the target element.
     * @param col Specifies the column number of the target element.
     * @return The value stored at the given position.
     * @throws ArrayIndexOutOfBoundsException Indicates that no element exists at the
     *                                        specified location.
     */
    public int get(int row, int col) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return element;
    }

    /**
     * @return The entire matrix.
     */
    public int[][] getMatrix() {
        return new int[0][0];
    }

    /**
     * @return The number of columns.
     */
    public int getWidth() {
        return 0;
    }

    /**
     * @return The number of rows.
     */
    public int getHeight() {
        return 0;
    }

    /**
     * @return The number of elements contained in this matrix.
     */
    public int getSize() {
        int count = 0;
        for (int r = 0; r < matrix.length; ++r) {
            count += matrix[r].length;
        }
        return count;
    }

    /**
     * @param index Specifies which row to return.
     * @return The row located at index.
     * @throws ArrayIndexOutOfBoundsException Indicates a row does not exist at the given index.
     */
    public int[] getRow(int index) {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * @param index Specifies which column to return.
     * @return The column located at index.
     * @throws ArrayIndexOutOfBoundsException Indicates a column does not exist at the given index.
     */
    public int[] getColumn(int index) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int [] col = new int[matrix.length];
        for (int i = 0; i < col.length; ++i) {
            col[i] = matrix[i][index];
        }
        return col;
    }

    public void put(int element, int row, int col) {
        ++size;
        matrix = new int[row + 1][col + 1];
        matrix[row][col] = element;
    }

    public void putColumn(int[] column, int cIndex) {
        ++size;
        int newHeight = column.length;
        matrix = new int[newHeight][1];
        for (int i = 0; i < column.length; ++i) {
            matrix[i][cIndex] = column[i];
        }
    }
}
