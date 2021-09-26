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
 * Задание: Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask03 {
	public static void main(String[] args) {
		int[][] array;
		int size;
		int k;
		int p;

		size = 10;
		array = new int[size][size];

		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				array[row][column] = (int) (Math.random() * 10);
				System.out.print(array[row][column] + " ");
			}
			System.out.println("");
		}

		k = (int) (Math.random() * size);
		p = (int) (Math.random() * size);
		System.out.println("k = " + (k + 1) + ", p = " + (p + 1) + "\n");

		for (int column = 0; column < size; column++) {
			System.out.print(array[k][column] + " ");
		}

		System.out.println("\n");

		for (int row = 0; row < 10; row++) {
			System.out.println(array[row][p]);
		}
	}
}
