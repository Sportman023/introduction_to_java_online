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
 * Задание: Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: 1/2^n + 1/3^n
 * 
 * @version
 * @author Vadim Ortman 
 */
public class CyclesTask05 {
   public static void main (String[] args){
        double e = 1e-9d;
        int n = 50;
        double result = 0d;
       
        for (int i = 0; i <= n; i++){
            double temp = 1/Math.pow(2, i) + 1/Math.pow(3, i);

            if (Math.abs(temp) >= e){
               result += temp;
            }
        }
        
        System.out.println("Result = " + result);
   }
}