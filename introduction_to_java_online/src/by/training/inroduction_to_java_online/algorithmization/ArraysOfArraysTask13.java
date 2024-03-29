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
 * Задание: Отсотрировать стобцы матрицы по возрастанию или убыванию значений
 * эементов.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask13 {
	public static void main(String[] args) {
		int[][] array;
		int arraySize;

		arraySize = 10;
		array = new int[arraySize][arraySize];

		for (int row = 0; row < arraySize; row++) {
			for (int column = 0; column < arraySize; column++) {
				array[row][column] = (int) (Math.random() * 10);
				System.out.print(array[row][column] + " ");
			}
			System.out.println("");
		}

		for (int column = 0; column < arraySize; column++) {
			boolean anyChanges;
			anyChanges = true;

			while (anyChanges) {
				anyChanges = false;

				for (int i = 0; i < (arraySize - 1); i++) {
					if (array[i][column] > array[i + 1][column]) {
						int temp;
						temp = array[i][column];
						array[i][column] = array[i + 1][column];
						array[i + 1][column] = temp;
						anyChanges = true;
					}
				}
			}
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
