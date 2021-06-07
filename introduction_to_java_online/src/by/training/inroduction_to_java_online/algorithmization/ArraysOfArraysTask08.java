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

import java.util.Scanner;

/**
 * Задание: В числовой матрице поменять местами два любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им позиции
 * другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask08 {
    public static void main(String[] args) {
        int[][] array;
        int[] columns;
        int arraySize;
        int temp;
        
        Scanner scanner;
                
        arraySize = 5;
        array = new int[arraySize][arraySize];
                
        for (int row = 0; row < arraySize; row++) {
            for (int column = 0; column < arraySize; column++) {
                array[row][column] = column + 1;
                System.out.print(array[row][column] + " ");
            }
            System.out.println("");
        }
        
        
        columns = new int[] {-1, -1};
             
        do {
            System.out.println("Введите номера столбцов");
            scanner = new Scanner(System.in);
            
            for (int i = 0; i < columns.length; i++) {
                if (scanner.hasNextInt()) {
                    columns[i] = scanner.nextInt() - 1;
                } else {
                    System.out.println("Вы ввели не целое число");
                    break;
                }    
            }
            
        } while ((columns[0] < 0) || (columns[0] >= arraySize) 
                || (columns[1] < 0) || (columns[1] >= arraySize));
        
        for (int row = 0; row < arraySize; row++) {
            temp = array[row][columns[0]];
            array[row][columns[0]] = array[row][columns[1]];
            array[row][columns[1]] = temp;
        }
        System.out.println("");
        for (int row = 0; row < arraySize; row++) {
            for (int column = 0; column < arraySize; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println("");
        }

    }
}
