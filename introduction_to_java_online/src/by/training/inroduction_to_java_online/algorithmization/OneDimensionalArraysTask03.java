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
 * Задание: Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysTask03 {
    public static void main(String[] args) {
        double array[];
        int n;
        int zeroCounter;
        int negativeCounter;
        int positiveCounter;
        
        n = 10;
        array = new double [n];
        zeroCounter = 0;
        negativeCounter = 0;
        positiveCounter = 0;
        
        for (int i = 0; i < n; i++) {
            array[i] = getRandomDouble();
        }
        
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                negativeCounter++;
            } else if (array[i] == 0) {
                zeroCounter++;
            }
        }
        
        positiveCounter = n - negativeCounter - zeroCounter;
        
        System.out.println("Кол-во отрицательных значений = " + negativeCounter 
                + "\nКол-во нулевых значений = " + zeroCounter 
                + "\nКол-во положительных значений = " + positiveCounter);
    }
    
    
    public static double getRandomDouble(){
        int sign;
        double randomDouble;
        
        if (Math.random() < 0.5) {
            sign = -1;
        } else {
            sign = 1;
        }
        
        randomDouble = (int) (Math.random() * 100) / 10.0;
        randomDouble = randomDouble * sign;
        return randomDouble;
    }
}
