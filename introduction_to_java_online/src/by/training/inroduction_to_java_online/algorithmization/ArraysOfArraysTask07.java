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
 * Задание: Сформировать квадратную матрицу порядка N по правилу: A[I,J] =
 * sin((I^2 - J^2) / N)
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask07 {
	public static void main(String[] args) {
		int n;
		double[][] array;
		int counter;

		n = 8;
		array = new double[n][n];
		counter = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = calculate(i, j, n);
				System.out.print(" " + array[i][j] + " ");
				if (array[i][j] > 0) {
					counter++;
				}
			}
			System.out.println("");
		}
		System.out.println("Кол-во положительных элементов = " + counter);
	}

	public static double calculate(int i, int j, int n) {
		double result;
		double num;
		double dem;

		num = Math.pow(i, 2) - Math.pow(j, 2);
		dem = (double) n;

		result = Math.sin(num / dem);
		return result;
	}
}
