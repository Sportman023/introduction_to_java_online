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
 * Задание: Даны две последовательности a1 меньше либо равно a2 меньше либо
 * равно ... меньше либо равно an и b1 меньше либо равно b2 меньше либо равно
 * ... меньше либо равно bm. Образовать из них новую последовательность чисел
 * так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не
 * использовать.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask02 {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 7, 9, 10, 11 };
		int[] array2 = { 2, 4, 6, 8, 12 };
		int[] array3;

		int array1Length;
		int array2Length;
		int array3Length;

		int currentIndex1;
		int currentIndex2;

		array1Length = array1.length;
		array2Length = array2.length;
		array3Length = array1Length + array2Length;

		array3 = new int[array3Length];

		currentIndex1 = 0;
		currentIndex2 = 0;

		for (int i = 0; i < array3Length; i++) {
			if (currentIndex1 < array1Length && array1[currentIndex1] < array2[currentIndex2]) {
				array3[i] = array1[currentIndex1];
				currentIndex1++;
			} else if (currentIndex2 < array2Length) {
				array3[i] = array2[currentIndex2];
				currentIndex2++;
			}
		}
		for (int i = 0; i < array3Length; i++) {
			System.out.print(array3[i] + ", ");
		}
	}
}
