package com.example.matrixsolver.matrix.math;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.ExemptionMechanismException;

public class IntMatrix {

    List<List<Integer>> matrixElements = new ArrayList<>();

    boolean isEmpty = true;
    int width = 0;

    public IntMatrix(int[][] initMatrix) {
        width = getLengthOfLargestRow(initMatrix);
        int maxHeight = initMatrix.length;
        isEmpty = false;
        for (int r = 0; r < maxHeight; ++r) {
            matrixElements.add(r, new ArrayList<>());
            int c = 0;
            for (; c < initMatrix[r].length; ++c) {
                matrixElements.get(r).add(c, initMatrix[r][c]);
            }
            for (; c < width; ++c) {
                matrixElements.get(r).add(c, 0);
            }
        }
    }

    private int getLengthOfLargestRow(int[][] darr) {
        int lengthOfLargestRow = 0;
        for (int r = 0; r < darr.length; ++r) {
            if (darr[r].length > lengthOfLargestRow) {
                lengthOfLargestRow = darr[r].length;
            }
        }
        return lengthOfLargestRow;
    }

    public IntMatrix() {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return matrixElements.size();
    }

    public class NoSuchElementException extends RuntimeException {

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getElement(int row, int col) {
        if (matrixElements.size() <= row || matrixElements.get(row).size() <= col) {
            throw new NoSuchElementException();
        }
        return matrixElements.get(row).get(col);
    }
}
