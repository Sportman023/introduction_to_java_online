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
 * Задание: Дана последовательность целых чисел a1, a2,...,an. Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны min( a1,
 * a2,..., an).
 * 
 * @author Vadim Ortman
 */

public class OneDimensionalArraysTask08 {
	public static void main(String[] args) {
		int[] array0;
		int[] array1;
		int sizeOfArray0;
		int sizeOfArray1;
		int minOfArray0;
		int minCounter;

		sizeOfArray0 = 5;
		array0 = new int[sizeOfArray0];

		for (int i = 0; i < sizeOfArray0; i++) {
			array0[i] = (int) (Math.random() * 10);
		}

		minOfArray0 = array0[0];
		minCounter = 0;

		for (int i = 0; i < sizeOfArray0; i++) {
			if (array0[i] < minOfArray0) {
				minOfArray0 = array0[i];
				minCounter = 1;
			} else if (array0[i] == minOfArray0) {
				minCounter++;
			}
		}

		sizeOfArray1 = sizeOfArray0 - minCounter;
		array1 = new int[sizeOfArray1];

		for (int i = 0, j = 0; i < sizeOfArray0; i++) {
			if (array0[i] != minOfArray0) {
				array1[j] = array0[i];
				j++;
			}
		}
	}
}