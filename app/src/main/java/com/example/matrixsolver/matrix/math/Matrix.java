package com.example.matrixsolver.matrix.math;

public class Matrix
{
    private double[][] matrixElements;

    public Matrix()
    {
        matrixElements = new double[0][0];
    }

    public int size()
    {
        int count = 0;
        for (int row = 0; row < matrixElements.length; ++row)
        {
            count += matrixElements[row].length;
        }
        return count;
    }

    public void putElement(double element, int row, int col)
    {
        if (needToExpand(matrixElements, row + 1, col + 1))
        {
            matrixElements = createExpandedMatrix(matrixElements, row + 1, col + 1);
        }
        matrixElements[row][col] = element;
    }

    public double obtainElement(int row, int col)
    {
        return matrixElements[row][col];
    }

    private int getLargestRowLength(double[][] arr)
    {
        int currentLargest = 0;
        for (int row = 0; row < arr.length; ++row)
        {
            if (arr[row].length > currentLargest)
            {
                currentLargest = arr[row].length;
            }
        }
        return currentLargest;
    }

    private void copy2DArray(double[][] destinationArr, double[][] sourceArr)
    {
        for (int r = 0; r < min(destinationArr.length, sourceArr.length); ++r)
        {
            for (int c = 0; c < min(destinationArr[r].length, sourceArr[r].length); ++c)
            {
                destinationArr[r][c] = sourceArr[r][c];
            }
        }
    }

    private int min(int a, int b)
    {
        if (a < b)
        {
            return a;
        }
        return b;
    }

    private int max(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        return b;
    }

    private boolean needToExpand(double[][] currentMatrix, int desiredHeight, int desiredWidth)
    {
        if (currentMatrix.length < desiredHeight ||
            getLargestRowLength(currentMatrix) < desiredWidth)
        {
            return true;
        }
        return false;
    }

    private double[][] createExpandedMatrix(double[][] matrix, int desiredHeight, int desiredWidth)
    {
        int newHeight = max(matrix.length, desiredHeight);
        int newWidth = max(getLargestRowLength(matrix), desiredWidth);
        double[][] newMatrix = new double[newHeight][newWidth];
        copy2DArray(newMatrix, matrix);
        return newMatrix;
    }
}
