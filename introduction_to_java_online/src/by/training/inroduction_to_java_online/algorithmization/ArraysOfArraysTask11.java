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
 * Задание: Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на
 * экран саму матрицу и номера строк, в которых число 5 встречается три и более
 * раз.
 * 
 * @author Vadim Ortman
 */

public class ArraysOfArraysTask11 {
	public static void main(String[] args) {
		int[][] array;
		int numberOfRows;
		int numberOfColumns;

		numberOfRows = 10;
		numberOfColumns = 20;
		array = new int[numberOfRows][numberOfColumns];

		for (int row = 0; row < numberOfRows; row++) {
			if (row < 9) {
				System.out.print(" " + (row + 1) + "| ");
			} else {
				System.out.print((row + 1) + "| ");
			}

			for (int column = 0; column < numberOfColumns; column++) {
				array[row][column] = (int) (Math.random() * 16);
				if (array[row][column] < 10) {
					System.out.print(" " + array[row][column] + " ");
				} else {
					System.out.print(array[row][column] + " ");
				}
			}
			System.out.println("");
		}

		System.out.print("Строки в которых 5 встречается 3 и более раз:");
		for (int row = 0; row < numberOfRows; row++) {
			int fivesCounter;
			fivesCounter = 0;
			for (int column = 0; column < numberOfColumns; column++) {
				if (array[row][column] == 5) {
					fivesCounter++;
				}
			}
			if (fivesCounter >= 3) {
				System.out.print(" " + (row + 1));
			}
		}
		System.out.println("");
	}
}
