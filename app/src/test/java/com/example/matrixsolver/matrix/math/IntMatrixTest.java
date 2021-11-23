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
    public void isEmptyOnEmptyConstruction() {
        assertEquals(0, emptyMatrix.getSize());
    }

    @Test
    public void hasNoWidthOnEmptyConstruction() {
        assertEquals(0, emptyMatrix.getWidth());
    }

    @Test
    public void hasNoHeightOnEmptyConstruction() {
        assertEquals(0, emptyMatrix.getHeight());
    }

    @Test
    public void throwsArrayIndexOutOfBoundsExceptionWhenGettingFromEmptyMatrix() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> emptyMatrix.get(0,0));
    }

    @Test
    public void throwsArrayIndexOutOfBoundsExceptionWhenGettingRowFromEmptyMatrix() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> emptyMatrix.getRow(0));
    }

    @Test
    public void throwsArrayIndexOutOfBoundsExceptionWhenGettingColumnFromEmptyMatrix() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> emptyMatrix.getColumn(0));
    }

    @Test
    public void returnsEmptyDoubleArrayWhenGettingMatrixOnEmptyConstruction() {
        int[][] emptyReturn = emptyMatrix.getMatrix();
        assertEquals(0, emptyReturn.length);
    }
}