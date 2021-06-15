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
 * Задание: Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... 
 * <= an.Требуется переставить элементы так, чтобы они были расположены по
 * убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength;
        
        arrayLength = array.length;
        
        for (int i = 0; i < arrayLength / 2; i++) {
            int temp;
            temp = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = temp;
        }
        
       for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
