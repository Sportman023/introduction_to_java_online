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
 * Задание: Сортировка вставками. Дана последовательность чисел a1, a2,...an.
 * Требуется переставить числа в порядке возрастания. Делается это следующим
 * образом. Пусть a1, a2, ... ai - упорядоченная последовательность, т. е. 
 * a1 меньше либо равно a2 меньше либо равно ... меньше либо равно an. Берется следующее число ai+1 и вставляется в
 * последовательность так, чтобы новая последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все элементы от i + 1 до n не будут
 * перебраны. Примечание. Место помещения очередного элемента в отсортированную
 * часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask05 {
    public static void main(String[] args) {
        int[] array;
        int length;
        
        length = 11;
        array = new int [length];
        
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        
        printArray(array);
        
        for (int i = 1; i < length; i++) {
            int temp;
            int newIndex;
            
            newIndex = binarySearch(array, i, i / 2, array[i]);
            for (int j = i; j > newIndex;  j--) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;   
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
    
    static int binarySearch (int[] array, int previousIndex, int currentIndex, int compareValue) {
        int nextIndex;     
        
        if (currentIndex + 1 >= array.length) {    
            return currentIndex;
        }
        
        if (array[currentIndex] < compareValue && array[currentIndex + 1] < compareValue) {
            nextIndex = currentIndex + Math.abs(previousIndex - currentIndex) / 2 + 1;
            return binarySearch (array, currentIndex, nextIndex, compareValue);
        } 
        
        if (array[currentIndex] > compareValue){
                nextIndex = currentIndex - Math.abs(currentIndex - previousIndex) / 2 - 1;
                if (nextIndex < 0) {
                    if (array[0] < compareValue) {
                        return 1;
                    } else {
                        return 0;
                    }
            } else{
                if (array[currentIndex - 1] <= compareValue) {
                    return currentIndex;
                } else {
                    return binarySearch (array, currentIndex, nextIndex, compareValue);
                }
                  
                }
        }
        return currentIndex + 1;
    }
}