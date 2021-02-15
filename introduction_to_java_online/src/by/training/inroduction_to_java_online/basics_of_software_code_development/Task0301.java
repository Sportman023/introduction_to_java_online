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
 * Задание: Просумировать все числа от 1 до предложенного числа.
 * 
 * @version
 * @author Vadim Ortman 
 */
public class Task0301 {
    public static void main (String [] args){
        int toNumber = 100;
        long result = 0;
        
        for (int i = 1; i <= toNumber; i++){
            result += i;
        }
        
        System.out.println("Summ all numbers from 1 to " + toNumber + " is " + result);
    }
}
