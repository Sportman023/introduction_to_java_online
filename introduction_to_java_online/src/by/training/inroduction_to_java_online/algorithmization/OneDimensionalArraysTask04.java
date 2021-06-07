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
 * Задание: Даны действительные числа а1 ,а2 ,..., аn.
 * Поменять местами наибольший и наименьший элементы.
 * 
 * @author Vadim Ortman
 */

public class OneDimensionalArraysTask04 {
    public static void main(String[] args) {
        double array[];
        int n;
        double minValue;
        double maxValue;
        int iMin;
        int iMax;

        n = 10;
        array = new double[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = Math.random() * 1000;
        }

        minValue = array[0];
        maxValue = array[0];
        iMin = 0;
        iMax = 0;
        
        for (int i = 0; i < n; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                iMin = i;
            }
            if (array[i] > maxValue){
                maxValue = array[i];
                iMax = i;
            }
        }

        array[iMin] = maxValue;
        array[iMax] = minValue;
    }
}
