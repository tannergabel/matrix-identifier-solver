package com.example.matrixsolver.matrix.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MatrixTest
{
    Matrix myMatrix;
    final double EQUALITY_CHECK_DELTA = 0.000001;

    @Before
    public void setup()
    {
        myMatrix = new Matrix();
    }

    @Test
    public void newMatrixIsEmpty()
    {
        assertEquals(0, myMatrix.size());
    }

    @Test
    public void puttingElementIncreasesSize()
    {
        myMatrix.putElement(0, 0, 0);
        assertEquals(1, myMatrix.size());
    }

    @Test
    public void test()
    {
        double e = 1;
        int r = 0, c = 0;
        myMatrix.putElement(e, r, c);
        assertEquals(e, myMatrix.obtainElement(r, c), EQUALITY_CHECK_DELTA);
    }
}