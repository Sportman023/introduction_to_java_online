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

import java.util.ArrayList;

/**
 * Задание: Даны два числа. Определить цифры, входящие в запись как первого так
 * и второго числа.
 * 
 * @version
 * @author Vadim Ortman
 */
public class CyclesTask08 {
	public static void main(String[] args) {
		double a = 123.044012D;
		String aStr;
		double b = 42D;
		String bStr;
		ArrayList<Character> numList = new ArrayList<Character>();

		if (a % 1 == 0) {
			aStr = Integer.toString((int) a); /**
												 * чтобы не учитвать ноль если число целое (1.0)
												 */
		} else {
			aStr = Double.toString(a);
		}

		if (b % 1 == 0) {
			bStr = Integer.toString((int) b); /**
												 * чтобы не учитвать ноль если число целое (1.0)
												 */
		} else {
			bStr = Double.toString(b);
		}

		for (int i = 0; i < aStr.length(); i++) {
			char aChr;
			aChr = aStr.charAt(i);

			if (!numList.contains(aChr)) {
				numList.add(aChr);
			}
		}

		for (Character i : numList) {
			for (int j = 0; j < bStr.length(); j++) {
				if (i.equals(bStr.charAt(j)) && i != '.') {
					System.out.println(i);
					break;
				}
			}
		}
	}
}