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
 * Задание: Дано действительное число R вида nnn.ddd.
 * Поменять местами дробную и цедую части числа.
 * 
 * @version
 * @author Vadim Ortman 
 */
public class Task0104 {
    public static void main (String [] args){
        double r = 123.456;
        double r1 = Math.round(r%1*1000);
        double r2 = (r-(double)Math.round(r%1*1000)/1000)/1000;
        double r3 = r1+r2;

        System.out.println("r: " + r + "; r3 " + r3);
    }
}
