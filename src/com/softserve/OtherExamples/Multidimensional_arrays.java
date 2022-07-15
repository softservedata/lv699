package com.softserve.OtherExamples;

import sun.awt.geom.AreaOp;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrice.length; i++) {   //зовнішній цикл
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
