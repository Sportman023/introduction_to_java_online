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
 * Задание: Найдите наибольший элемент матрицы и заменить все нечетные элементы
 * на него.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask15 {
    public static void main(String[] args) {
        int[][] array;
        int arrSz;
        int maxVal;
        
        arrSz = 5;
        array = new int[arrSz][arrSz];
        
        for (int row = 0; row < arrSz; row++) {
            for (int column = 0; column < arrSz; column++) {
                array[row][column] = (int)(Math.random() * 100);
                
                if (array[row][column] < 10) {
                    System.out.print("0" + array[row][column] + " ");
                } else {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println("");
        }
        
        maxVal = array[0][0];
        
        for (int row = 0; row < arrSz; row++) {
            for (int column = 0; column < arrSz; column++) {
                if (maxVal < array[row][column]) {
                    maxVal = array[row][column];
                }
            }
        }
        System.out.println("\nMax value = " + maxVal + "\n");
        
        for (int row = 0; row < arrSz; row++) {
            for (int column = 0; column < arrSz; column++) {
                if ((array[row][column] % 2) > 0) {
                    array[row][column] = maxVal;
                }
                 if (array[row][column] < 10) {
                    System.out.print("0" + array[row][column] + " ");
                } else {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }
}
