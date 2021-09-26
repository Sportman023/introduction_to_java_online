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
 * Задание: Дана матрица. Вывести на экран все нечетные столбцы, у которых
 * первый элемент больше последнего.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask01 {
	public static void main(String[] args) {
		int[][] array;
		int sizeI;
		int sizeJ;

		sizeI = 10;
		sizeJ = 10;
		array = new int[sizeI][sizeJ];

		for (int i = 0; i < sizeI; i++) {
			for (int j = 0; j < sizeJ; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < sizeI; i++) {
			for (int j = 0; j < sizeJ; j += 2) {
				if (array[0][j] > array[sizeI - 1][j]) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
}
