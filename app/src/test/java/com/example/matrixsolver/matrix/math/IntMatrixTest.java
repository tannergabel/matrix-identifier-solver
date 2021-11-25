package com.example.matrixsolver.matrix.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class IntMatrixTest {

    IntMatrix emptyMatrix;

    @Before
    public void setup() {
        emptyMatrix = new IntMatrix();
    }

    @Test
    public void emptyMatrixHasNoSize() {
        assertEquals(0, emptyMatrix.getSize());
    }

    @Test
    public void emptyMatrixHasNoWidth() {
        assertEquals(0, emptyMatrix.getWidth());
    }

    @Test
    public void emptyMatrixHasNoHeight() {
        assertEquals(0, emptyMatrix.getHeight());
    }

    @Test
    public void emptyMatrixThrowsArrayIndexOutOfBoundsWhenGetting() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> emptyMatrix.get(0,0));
    }

    @Test
    public void emptyMatrixThrowsArrayIndexOutOfBoundsWhenGettingRow() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> emptyMatrix.getRow(0));
    }

    @Test
    public void emptyMatrixThrowsArrayIndexOutOfBoundsWhenGettingColumn() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> emptyMatrix.getColumn(0));
    }

    @Test
    public void emptyMatrixDoubleArrIsEmpty() {
        int[][] emptyReturn = emptyMatrix.getMatrix();
        assertEquals(0, emptyReturn.length);
    }

    @Test
    public void puttingElementIncreasesSize() {
        emptyMatrix.put(0, 0, 0);
        assertEquals(1, emptyMatrix.getSize());
    }

    @Test
    public void getElementAfterPuttingElement() {
        int element = 0, row = 0, col = 0;
        emptyMatrix.put(element, row, col);
        assertEquals(element, emptyMatrix.get(row, col));
    }

    @Test
    public void getColumnAfterPuttingColumn() {
        int[] column = new int[] {1, 2, 3};
        int cIndex = 0;
        emptyMatrix.putColumn(column, cIndex);
        int[] returnedColumn = emptyMatrix.getColumn(cIndex);
        for (int i = 0; i < column.length; ++i) {
            assertEquals(column[i], returnedColumn[i]);
        }
    }

    @Test
    public void initMatrixHasSize() {
        int n = 3, m = 3;
        int[][] arr = new int[n][m];
        IntMatrix mat = new IntMatrix(arr);
        assertEquals(n*m, mat.getSize());
    }
}