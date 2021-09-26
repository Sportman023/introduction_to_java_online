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
 * Задание: Даны размары А, В прямоугольного отверстия и размеры x, y, z
 * кирпича. Определить, пройдет ли кирпич через отверстие.
 * 
 * @version
 * @author Vadim Ortman
 */
public class BranchingTask04 {
	public static void main(String[] args) {
		int A = 2;
		int B = 8;

		int x = 7;
		int y = 16;
		int z = 3;

		int minAB;
		int maxAB;

		int minXYZ;
		int midXYZ;

		minAB = Math.min(A, B);
		maxAB = Math.max(A, B);

		minXYZ = Math.min(Math.min(x, y), Math.min(y, z));
		midXYZ = (x + y + z) - minXYZ - Math.max(Math.max(x, y), Math.max(y, z));

		System.out.println(
				"minAB = " + minAB + " minXYZ = " + minXYZ + "\n" + "maxAB = " + maxAB + " midXYZ = " + midXYZ);

		if (minAB >= minXYZ && maxAB >= midXYZ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}