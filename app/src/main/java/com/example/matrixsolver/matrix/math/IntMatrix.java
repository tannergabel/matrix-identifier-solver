package com.example.matrixsolver.matrix.math;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.ExemptionMechanismException;

public class IntMatrix {

    /**
     * Initializes an empty matrix.
     */
    public IntMatrix() {

    }

    /**
     * Initializes a matrix with the given 2d array. Uneven rows / columns will be evened out with
     * zeros.
     * @param initialMatrix 2D array which will have its values put into the matrix.
     * @throws NullPointerException Indicates that the given parameter is null.
     */
    public IntMatrix(int[][] initialMatrix) {

    }

    /**
     * Initializes an n x m zero matrix.
     * @param n Number of rows.
     * @param m Number of columns.
     * @throws IllegalArgumentException Indicates that a given argument is < 0.
     */
    public IntMatrix(int n, int m) {

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
        return 0;
    }

    /**
     * Inserts a value at (row, col). The matrix will be expanded and padded with zeros
     * to fit the new element at the given position.
     * @param newElement New value to be inserted into matrix.
     * @param row Specifies the row to place the element.
     * @param col Specifies the column to place the element.
     * @throws IllegalArgumentException Indicates that either row or col < 0.
     */
    public void put(int newElement, int row, int col) {

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
     * @param index Specifies which row to return.
     * @return The row located at index.
     * @throws ArrayIndexOutOfBoundsException Indicates a row does not exist at the given index.
     */
    public int[] getRow(int index) {
        return null;
    }

    /**
     * @param index Specifies which column to return.
     * @return The column located at index.
     * @throws ArrayIndexOutOfBoundsException Indicates a column does not exist at the given index.
     */
    public int[] getColumn(int index) {
        return null;
    }

    /**
     * Inserts a row at a given index.
     * @param row Row to be inserted into the matrix.
     * @param index Index to insert the row.
     * @throws ArrayIndexOutOfBoundsException Indicates an invalid index.
     * @throws NullPointerException Indicates row argument is null.
     */
    public void putRow(int[] row, int index) {

    }

    /**
     * Inserts a column at a given index.
     * @param column Column to be inserted into the matrix.
     * @param index Index to insert the column.
     * @throws ArrayIndexOutOfBoundsException Indicates an invalid index.
     * @throws NullPointerException Indicates column argument is null.
     */
    public void putColumn(int[] column, int index) {

    }

    /**
     * @param r1 Indicates the row of the submatrix's starting element.
     * @param c1 Indicates the column of the submatrix's starting element.
     * @param r2 Indicates the row of the submatrix's ending element.
     * @param c2 Indicates the column of the submatrix's ending element.
     * @return A submatrix whose element at (0,0) is the element from this matrix at
     * (r1,c1) and whose bottom-right-most element is the element from this matrix at
     * (r2,c2)
     * @throws ArrayIndexOutOfBoundsException Indicates one of the given parameters exceeds
     * the size of the matrix or is < 0.
     */
    public int[][] getSubmatrix(int r1, int c1, int r2, int c2) {
        return null;
    }
}
