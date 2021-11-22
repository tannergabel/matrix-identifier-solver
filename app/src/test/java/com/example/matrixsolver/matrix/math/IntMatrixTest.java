package com.example.matrixsolver.matrix.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
    public void hasNoWidthAndHeightOnEmptyCreation() {
        assertEquals(0, matrix.getWidth());
        assertEquals(0, matrix.getHeight());
    }

    @Test
    public void hasWidthAndHeightOnNonEmptyInitialization() {
        int[][] arr = new int[][] {
                {1},
                {1, 2}
        };
        IntMatrix m = new IntMatrix(arr);
        assertEquals(arr.length, m.getHeight());
        assertEquals(getWidthOfLargestRowInDoubleArray(arr), m.getWidth());
    }

    private int getWidthOfLargestRowInDoubleArray(int[][] arr) {
        int largestWidth = 0;
        for (int r = 0; r < arr.length; ++r) {
            if (arr[r].length > largestWidth) {
                largestWidth = arr[r].length;
            }
        }
        return largestWidth;
    }

    @Test
    public void throwsNPEWhenInitializedWithNull() {
        assertThrows(NullPointerException.class, () -> new IntMatrix(null));
    }

    @Test
    public void throwExceptionWhenGettingNonExistentElement() {
        assertThrows(IntMatrix.NoSuchElementException.class, () -> matrix.getElement(0, 0));
    }

    @Test
    public void isNotEmptyWhenInitializingWithOneElement() {
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

    @Test
    public void autoExpandsWhenPassedUnevenDoubleArray() {
        int[][] unevenArray = new int[][] {
                {1, 2, 3},
                {4, 5},
                {-16}
        };
        IntMatrix matrix = new IntMatrix(unevenArray);
        assertEquals(0, matrix.getElement(1, 2));
    }


}