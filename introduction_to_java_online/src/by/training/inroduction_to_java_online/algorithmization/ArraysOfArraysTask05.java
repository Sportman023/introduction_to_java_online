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
 * Задание: Сформировать квадратную матрицу порядка n по заданному образцу(n -
 * четное): 1 1 1 ... 1 1 1 2 2 2 ... 2 2 0 3 3 3 ... 3 0 0 n-1 n-1 0 ... 0 0 0
 * n 0 0 ... 0 0 0
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask05 {
	public static void main(String[] args) {
		int[][] array;
		int n;

		do {
			n = (int) (Math.random() * 10 + 1);
		} while ((n % 2) > 0);

		System.out.println("n = " + n);

		array = new int[n][n];

		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				if ((n - column) > row) {
					array[row][column] = row + 1;
					System.out.print(array[row][column] + " ");
				} else {
					array[row][column] = 0;
					System.out.print(array[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}

}
