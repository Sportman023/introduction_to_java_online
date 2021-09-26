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
 * Задание: Сортировка обменами. Дана последовательность чисел a1 меньше либо
 * равно a2 меньше либо равно ... меньше либо равно an. Требуется переставить
 * числа в порядке возрастания. Для этого сравниваются два соседних числа ai и
 * ai+1. Если ai > ai+1, то делается перестановка. Так продолжается до тех пор,
 * пока все элементы не станут расположены в порядке возрастания. Составить
 * алгоритм сортировки, подсчитывая при этом количества перестановок.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask04 {
	public static void main(String[] args) {
		int[] array;
		array = new int[10];
		int swapNumbers;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + ",");
		}
		System.out.println("");

		do {
			swapNumbers = 0;
			for (int i = 0; i < array.length - 1; i++) {
				int temp;
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapNumbers++;
				}
			}
		} while (swapNumbers > 0);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}

	}
}
