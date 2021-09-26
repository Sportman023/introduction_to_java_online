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
 * Задание: В массив A [N] занесены натуральные числа. Найти сумму тех
 * элементов, которые кратны данному К.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysTask01 {
	public static void main(String[] args) {
		int[] a;
		int n;
		int k;
		int sum;

		n = 10;
		a = new int[n];
		k = 3;
		sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < n; i++) {
			if ((a[i] % k) == 0) {
				if ((sum + a[i]) < sum) {
					System.out.println("variable is overflowed");
				} else {
					sum += a[i];
				}
			}
		}
		System.out.println("Сумма элементов кратных K = " + sum);
	}
}
