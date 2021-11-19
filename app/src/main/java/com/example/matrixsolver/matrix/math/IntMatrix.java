package com.example.matrixsolver.matrix.math;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.ExemptionMechanismException;

public class IntMatrix {

    List<List<Integer>> matrixElements;

    boolean isEmpty = true;

    public IntMatrix(int[][] initMatrix) {
        isEmpty = false;
        matrixElements = new ArrayList<>();
        for (int r = 0; r < initMatrix.length; ++r) {
            matrixElements.add(r, new ArrayList<>());
            for (int c = 0; c < initMatrix[r].length; ++c) {
                matrixElements.get(r).add(c, initMatrix[r][c]);
            }
        }
    }

    public IntMatrix() {

    }

    public class NoSuchElementException extends RuntimeException {

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getElement(int row, int col) {
        if (isEmpty) {
            throw new NoSuchElementException();
        }
        return matrixElements.get(row).get(col);
    }
}
