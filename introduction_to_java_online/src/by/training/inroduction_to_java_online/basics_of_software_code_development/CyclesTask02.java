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

/**
 * Задание: Вычислите значения функции на отрезке [a,b] с шагом h y = x, x > 2 S
 * -x, x <= 2.
 * 
 * @version
 * @author Vadim Ortman
 */
public class CyclesTask02 {
	public static void main(String[] args) {
		int a = -10;
		int b = 10;
		int h = 3;

		for (int x = a; x <= b; x += h) {
			if (x > 2) {
				System.out.println("x = " + x + "; y = " + x);
			} else {
				System.out.println("x = " + x + "; y = " + -x);
			}
		}
	}
}
