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
package by.training.inroduction_to_java_online.algorithmization;

/**
 * Задание: Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysTask02 {
    public static void main(String[] args) {
        double[] array;
        double z;
        int replaseCounter;
        
        array = new double [100];
        z = 3.5;
        replaseCounter = 0;
        
        for (int i = 0; i < 100; i++){
            array[i] = Math.random() * 10;
        }
        
        for (int i = 0; i < 100; i++) {
            if (array[i] > z) {
                array[i] = z;
                replaseCounter ++;
            }
        }
        System.out.println("Кол-во замен = " + replaseCounter);
    }
}
