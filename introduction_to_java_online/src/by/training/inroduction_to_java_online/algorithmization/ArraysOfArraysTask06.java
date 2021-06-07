/*
 * Copyright (C) 2021 Vadim
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package by.training.inroduction_to_java_online.algorithmization;

/**
 * Задание: Сформировать квадратную матрицу порядка n 
 * по заданному образцу(n - четное):
 * 1 1 1 ... 1 1 1
 * 0 1 1 ... 1 1 0
 * 0 0 1 ... 1 0 0
 * 0 1 1 ... 1 1 0
 * 1 1 1 ... 1 1 1
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask06 {
    public static void main(String[] args) {
        int[][] array;
        int n;
        
        n = 10;
        array = new int[n][n];
        
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row < n/2) {
                    if (row > column || column >= (n - row)) {
                        array[row][column] = 0;
                        System.out.print("0 ");
                    } else {               
                        array[row][column] = 1;
                        System.out.print("1 ");
                    }
                } else {
                    if ((n - row - 1) > column || column > row) {
                        array[row][column] = 0;
                        System.out.print("0 ");
                    } else {               
                        array[row][column] = 1;
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println("");
        }
        
    }
}
