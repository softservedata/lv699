package com.softserve.Project1_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SudokuSolver2 {
    private static final int SUDOKU_SIZE = 9;
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    private static final int EMPTY_FIELD = 0;
    public static final String MAGENTA = "\u001B[35m";

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
            for (int column = 0; column < SUDOKU_SIZE; column++) {
                System.out.print(GREEN + sudoku[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int[][] sudoku) {
        for (int[] row : sudoku) {
            for (int value : row) {
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


    public static void main(String[] args) throws IOException {
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
        SudokuSolver2 sudokuPrinter = new SudokuSolver2();
        sudokuPrinter.print(sudoku);


        if (sudokuSolver(sudoku)) {
            System.out.println("Solved successfully!");
        } else {
            System.out.println("UnSolvable sudoku");
        }
        printSudoku(sudoku);


        //____________________________________________________
        FileReader fr = null;
        BufferedReader br = null;
        System.out.println(BLUE + "********************************************** ");
        String fileName = "C:/Liuba/Kurs OP/Java core/Home work/sudoku.txt";
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String s = null;
        int k = 0;

        int[][] sudoku1 = new int[9][9];
        System.out.println("sudoku from the file: " );
            while ((s = br.readLine()) != null) {
                for (int i = 0; i < 9; i++) {
                   k=0;
                    for (int j = 0; j < 9; j++) {
                        sudoku1[i][k] = Integer.parseInt(String.valueOf(s.substring(k, k + 1)));
                        k++;
                        System.out.print(sudoku1[i][j] + " ");

                    }
                    System.out.println();


                }
            }
            br.close();


        System.out.println(MAGENTA + "********************************************** ");
            System.out.println("sudoku1[i][j]");
            for (int i = 0; i < 9; i++)    {
        for (int j = 0; j < 9; j++) {
            System.out.print(sudoku1[i][j]+" ");
        }
        System.out.println();


    }}}