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
 * Задание: Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask14 {
    public static void main(String[] args) {
        int[][] array;
        int m;
        int n;
        
        m = (int)(Math.random() * 8) + 2;
        n = (int)(Math.random() * 8) + 2;
        
        if (m < n) {
            m = n;
        }
        
        array = new int[m][n];
        
        for (int column = 0; column < n; column++) {
            int onesCounter;
            onesCounter = 0;

            for (int row = 0; row < m; row++) {
                if (onesCounter < (column + 1)) {
                    if ((m - row) == ((column + 1) - onesCounter)) {
                        array[row][column] = 1;
                        onesCounter++;
                    } else {
                        array[row][column] = (int)(Math.random() * 2);

                        if (array[row][column] == 1) {
                            onesCounter++;
                        }    
                    }
                }
            }    
        }
            
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println("");
        }
        
    }
}
