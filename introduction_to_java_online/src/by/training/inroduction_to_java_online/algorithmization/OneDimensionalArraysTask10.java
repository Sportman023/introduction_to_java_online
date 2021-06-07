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
 * Задание: Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 * Примечание: Дополнительный массив не использовать.
 * 
 * @author Vadim Ortman
 */

public class OneDimensionalArraysTask10 {
    public static void main(String[] args) {
        int[] array;
        int n;
        
        n = 9;
        array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if ((i * 2) < n) {
                array[i] = array[i * 2];
            } else {
                array[i] = 0;
            }
        System.out.print(array[i] + ", ");
        }
    }
}
