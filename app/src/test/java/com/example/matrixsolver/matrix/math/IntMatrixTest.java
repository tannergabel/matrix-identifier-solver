package com.example.matrixsolver.matrix.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class IntMatrixTest {

    IntMatrix matrix;

    @Before
    public void setup() {
        matrix = new IntMatrix();
    }

    @Test
    public void isEmptyOnCreation() {
        assertTrue(matrix.isEmpty());
    }

    @Test
    public void throwExceptionWhenGettingNonExistentElement() {
        assertThrows(IntMatrix.NoSuchElementException.class, () -> matrix.getElement(0, 0));
    }

    @Test
    public void isNotEmptyWhenIntitializingWithOneElement() {
        IntMatrix matrix = new IntMatrix(new int[][] {{1}});
        assertFalse(matrix.isEmpty());
    }

    @Test
    public void returnsElementAfterInitializingWithElement() {
        int e = 1;
        IntMatrix matrix = new IntMatrix(new int[][]{{e}});
        assertEquals(e, matrix.getElement(0, 0));
    }

    @Test
    public void containsRowAfterInitializingWithRow() {
        int[] row = new int[] {1, 2, 3};
        IntMatrix matrix = new IntMatrix(new int[][]{row});
        for (int i = 0; i < row.length; ++i) {
            assertEquals(row[i], matrix.getElement(0, i));
        }
    }
}