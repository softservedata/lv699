package com.softserve.MyProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class SudokuSolver1 {
    private static final int SUDOKU_SIZE = 9;
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    private static final int EMPTY_FIELD = 0;

    private static boolean numberIsInRow(int[][] sudoku, int number, int row) {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (sudoku[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean numberIsInColumn(int[][] sudoku, int number, int column) {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (sudoku[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean numberIsIn3x3Box(int[][] sudoku, int number, int row, int column) {
        int startRow = row - row % 3;
        int startColumn = column - column % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (sudoku[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean placeIsCorrect(int[][] sudoku, int number, int row, int column) {
        return !numberIsInRow(sudoku, number, row) && !numberIsInColumn(sudoku, number, column) && !numberIsIn3x3Box(sudoku, number, row, column);
    }

    private static boolean sudokuSolver(int[][] sudoku) {
        for (int row = 0; row < SUDOKU_SIZE; row++) {
            for (int column = 0; column < SUDOKU_SIZE; column++) {
                if (sudoku[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= SUDOKU_SIZE; numberToTry++) {
                        if (placeIsCorrect(sudoku, numberToTry, row, column)) {
                            sudoku[row][column] = numberToTry;
                            if (sudokuSolver(sudoku)) {
                                return true;
                            } else {
                                sudoku[row][column] = 0;

                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static void printSudoku(int[][] sudoku) {
        for (int row = 0; row < SUDOKU_SIZE; row++) {
            for (int column = 0; column < SUDOKU_SIZE; column++)  {
                System.out.print(GREEN+ sudoku[row][column]+ " ");
            }
            System.out.println();
        }
    }
    public static void print (int[][] sudoku) {
        for (int[] row: sudoku) {
            for (int value:row) {
                printNumber(value);
            }
            System.out.println();
        }
    }

    private static void printNumber(int value) {
        if (value == EMPTY_FIELD) {
            System.out.print(RED + "* ");
        } else {
            System.out.print(GREEN + value + " ");
        }
    }


    public static void main (String[]args){
        int[][] sudoku = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };
        SudokuSolver1 sudokuPrinter = new SudokuSolver1();

        sudokuPrinter.print(sudoku);


if (sudokuSolver(sudoku)) {
    System.out.println("Solved successfully!");
} else {
    System.out.println("UnSolvable sudoku");
}
printSudoku(sudoku);
    }

    }