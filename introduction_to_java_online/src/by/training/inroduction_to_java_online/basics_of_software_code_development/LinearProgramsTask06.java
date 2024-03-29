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
 * Задание: Для данной области составить программу, которая печатает true, если
 * сточка с координатами (x, y) принадлежит закрашенной области, и false — в
 * противном случае
 * 
 * @version
 * @author Vadim Ortman
 */
public class LinearProgramsTask06 {
	public static void main(String[] args) {
		double x;
		double y;
		boolean result;

		x = 4;
		y = -0.1;
		result = false;

		if (((x >= -4 && x < -2) && (y >= -3 && y < 0)) || ((x >= -2 && x < 2) && (y >= -3 && y < 4))
				|| ((x >= 2 && x < 4) && (y >= -3 && y < 0))) {
			result = true;
		}

		System.out.println(result);
	}
}