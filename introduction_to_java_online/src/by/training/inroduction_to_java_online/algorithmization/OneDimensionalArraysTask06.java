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
 * Задание: Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 * 
 * @author Vadim Ortman
 */

public class OneDimensionalArraysTask06 {
    public static void main(String[] args) {
        double[] arrayN;
        boolean[] arrayR; 
        int n;
        double sum;
        
        n = 100;
        arrayN = new double[n];
        
        for (int i = 0; i < n; i++) {
            arrayN[i] = Math.random() * 100;
        }
        
        arrayR = new boolean[n];
        arrayR[2] = true;
        
        for (int i = 3; i < n; i++) {
            boolean iIsSimple;
            iIsSimple = true;
            
            for (int j = 2; j < n; j++) {
                if ((arrayR[j] && (i%j == 0))) {
                    iIsSimple = false;
                    break;
                }                 
            }
            if (iIsSimple) {
                arrayR[i] = true;
            }
        }
        
        sum = 0;
        for (int i = 0; i < n; i++) {
            if (arrayR[i]) {
                sum += arrayN[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}