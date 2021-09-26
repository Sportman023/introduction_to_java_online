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
 * Задание: В массиве целых чисел с количеством элементов n найти наиболее часто
 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
 * них.
 * 
 * @author Vadim Ortman
 */

public class OneDimensionalArraysTask09 {
	public static void main(String[] args) {
		int[] array;
		int[] arrayCount;
		int n;
		int maxCount;
		int minValue;

		n = 10;
		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + ", ");
		}

		arrayCount = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] == array[j]) {
					arrayCount[i]++;
				}
			}
		}

		maxCount = arrayCount[0];
		minValue = array[0];

		for (int i = 0; i < 10; i++) {
			if (arrayCount[i] > maxCount) {
				maxCount = arrayCount[i];
				minValue = array[i];
			} else if ((arrayCount[i] == maxCount) && (array[i] < minValue)) {
				maxCount = arrayCount[i];
				minValue = array[i];
			}
		}

		System.out.println("\n Минимальное из наиболее часто встречающихся чисел в массиве = " + minValue);

	}
}
