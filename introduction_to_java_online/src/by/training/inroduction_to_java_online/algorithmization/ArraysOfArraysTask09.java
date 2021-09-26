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
 * Задание: Задана матрица неотрицательных чисел. Посчитать сумму элементов в
 * каждом столбце. Определить, какой столбец содержит максимальную сумму.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask09 {
	public static void main(String[] args) {
		int[][] array;
		int arraySize;
		int columnMax;
		int max;

		arraySize = 5;
		array = new int[arraySize][arraySize];

		for (int row = 0; row < arraySize; row++) {
			for (int column = 0; column < arraySize; column++) {
				array[row][column] = (int) (Math.random() * 10);
				System.out.print(array[row][column] + " ");
			}
			System.out.println("");
		}

		columnMax = -1;
		max = -1;

		for (int column = 0; column < arraySize; column++) {
			int columnSum;
			columnSum = 0;
			for (int row = 0; row < arraySize; row++) {
				columnSum += array[row][column];
			}

			if (columnSum > max) {
				max = columnSum;
				columnMax = column;
			}
		}

		System.out.println("Столбец №" + (columnMax + 1) + " содержит максимальную сумму (" + max + ")");
	}
}
