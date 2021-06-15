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
 * Задание: Заданы два одномерных массива с различным количеством элементов
 * и натуральное число k. Объединить их в один массив, включив второй массив
 * между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask01 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {9, 9, 9};
        int[] array3;
        int k;
        int array1Length;
        int array2Length;
        int array3Length;
        
        array1Length =  array1.length;
        array2Length =  array2.length;
        array3Length = array1Length + array2Length;
        array3 = new int[array3Length];
        
        k = 1;
        int i1 = 0;
        for (int i3 = 0; i3 < array3Length; i3++) {
            if (i3 == k) {
                for (int i2 = 0; i2 < array2Length; i2++) {
                    array3[i3] = array2[i2];
                    i3++;
                }
            }
                        
            array3[i3] = array1[i1];
            i1++;
        }   
        
        for (int i = 0; i < array3Length; i++) {
            System.out.print(array3[i] + ", ");
        }
    }
}
