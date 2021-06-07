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
 * Задание: Вычислить значение функции:
 * F(x) = x^2 - 3x + 9 for x <=3, S 1/(x^3 + 6) for x >3
 * 
 * @version
 * @author Vadim Ortman 
 */
public class BranchingTask05 {
    public static void main (String [] args){
        double x = -1.0d;

        if (x <= 3){
            System.out.println((Math.pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}