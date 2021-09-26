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
package by.training.inroduction_to_java_online.basics_of_software_code_development;

import java.util.Scanner;

/**
 * Задание: Для каждого натурального числа в промежутке от m до n вывести все
 * делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 * 
 * @version
 * @author Vadim Ortman
 */
public class CyclesTask07 {
	public static void main(String[] args) {
		int m;
		int n;

		m = enterFromConsole("Введите число 1 ");
		n = enterFromConsole("Введите число 2 ");

		for (int i = m; i <= n; i++) {
			System.out.println("Делители для числа " + i + ":");
			for (int j = 2; j < n; j++) {
				if ((j != 1) && (j != i) && (i % j == 0)) {
					System.out.println(j + ";");
				}
			}
		}
	}

	public static int enterFromConsole(String message) {
		Scanner sc;

		sc = new Scanner(System.in);

		System.out.print(message);

		while (!sc.hasNextInt()) {
			String ln;
			ln = sc.nextLine();

			System.out.print(ln + " не целое число\n" + message);
		}

		return sc.nextInt();
	}
}
