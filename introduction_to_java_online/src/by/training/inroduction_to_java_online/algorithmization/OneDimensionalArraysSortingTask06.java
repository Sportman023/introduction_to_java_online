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
 * Задание: Дан массив n действительных чисел. Требуется упорядочить его по 
 * возрастанию. Делается это следующим образом: сравниваются два соседних
 * элемента ai и ai+1. Если ai меньше либо равно ai+1, то продвигаются на один
 * элемент вперед. Если ai больше ai+1, то производится перестановка и
 * сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask06 {
    public static void main(String[] args) {
        int[] array;
        int length;
        
        length = 10;
        array = new int[length];
        
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        printArray(array);
        
        for (int i = 0; i < length - 1; i++) {
            if (i < 0) {
                i = 0;
            }

            if (array[i] > array[i + 1]) {
                int temp;
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                
                i = i - 2;
            }
        }
        printArray(array);
                
    }
    static void printArray(int[] arrayPrint){
        int arrayLength;
        arrayLength = arrayPrint.length;

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arrayPrint[i] + ", ");
        }
        System.out.println("");
    }
}
