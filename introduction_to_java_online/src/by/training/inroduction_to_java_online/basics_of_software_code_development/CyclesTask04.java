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
 * Задание: Составить программу нахождения произведения квадратов
 * первых двухсот чисел.
 * 
 * @version
 * @author Vadim Ortman 
 */
public class CyclesTask04 {
    public static void main (String [] args){
        long result = 1;
        boolean variableIsOverflowed = false;
        
        for (int i = 1; i <= 200; i++){
            if ((result * (long) Math.pow(i,2)) < result){
                System.out.println("I can't finish the calculation because "
                        + "variable is overflowed!");
                variableIsOverflowed = true;
                break;
            }
            result *= Math.pow(i, 2);
        }
        if (!variableIsOverflowed){
            System.out.println(String.format("Произведение квадратов первых 200"
                    + " чисел = %,d", result));
        }
    }
}
