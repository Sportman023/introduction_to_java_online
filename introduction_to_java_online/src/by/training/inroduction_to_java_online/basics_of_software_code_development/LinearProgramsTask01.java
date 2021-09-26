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
 * Задание: найдите значение функции: z = ((a-3)*b/2)+c
 * 
 * @version
 * @author Vadim Ortman
 */
public class LinearProgramsTask01 {
	public static void main(String[] args) {
		double a = 2;
		double b = 7;
		double c = 12;
		double z;

		z = ((a - 3) * b / 2.0) + c;

		System.out.println("При a = " + a + ", b = " + b + " и c = " + c + " значение функции ((a-3)*b/2)+c = " + z);
	}
}
