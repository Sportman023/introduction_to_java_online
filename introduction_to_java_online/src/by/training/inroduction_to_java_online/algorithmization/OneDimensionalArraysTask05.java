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
 * Задание: Даны целые числа а1 ,а2 ,..., аn. Вывести на печать только те числа,
 * для которых аi > i
 * 
 * @author Vadim Ortman
 */

public class OneDimensionalArraysTask05 {
	public static void main(String[] args) {
		int[] array;
		int n;

		n = 100;
		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 10) + ((int) (Math.random() * 10) * 10);
		}

		for (int i = 0; i < n; i++) {
			if (array[i] > i) {
				System.out.println(array[i]);
			}
		}
	}
}
