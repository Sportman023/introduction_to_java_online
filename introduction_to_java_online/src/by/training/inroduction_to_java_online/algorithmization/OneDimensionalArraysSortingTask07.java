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
 * Задание: Пусть даны две неубывающие последовательности действительных чисел
 * a1 меньше либо равно a2 меньше либо равно ... меньше либо равно an и b1 
 * меньше либо равно b2 меньше либо равно ... меньше либо равно bm. 
 * Требуется указать те места, на которые нужно вставлять элементы
 * последовательности b1 меньше либо равно b2 меньше либо равно ... меньше либо
 * равно bm в первую последовательность так, чтобы новая последовательность
 * оставалась возрастающей.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask07 {
    public static void main(String[] args) {
        int[] arrayA;
        int[] arrayB;
        int lengthA;
        int lengthB;
        
        lengthA = 10;
        lengthB = 10;
        arrayA = new int [lengthA];
        arrayB = new int [lengthB];
        
        arrayA[0] = (int)(Math.random() * 10);
        for (int i = 1; i < lengthA; i++) {
            arrayA[i] = arrayA[i - 1] + (int)(Math.random() * 10);
        }
        
        arrayB[0] = (int)(Math.random() * 10);
        for (int i = 1; i < lengthB; i++) {
            arrayB[i] = arrayB[i - 1] + (int)(Math.random() * 10);
        }
        
       printArray(arrayA);
        printArray(arrayB);
        int currentIA;
        currentIA = 0;
        for (int ib = 0; ib < lengthB; ib++) {
            for (int ia = currentIA; ia < lengthA; ia++) {
                if (ia == 0 && arrayA[ia] > arrayB[ib]) {
                    System.out.println("b" + ib + " before a" + ia);
                    currentIA = ia;
                    break;
                }
                
                if (ia + 1 < lengthA && arrayA[ia] <= arrayB[ib] 
                        && arrayA[ia + 1] > arrayB[ib]) {
                    System.out.println("b" + ib + " after a" + ia);
                    currentIA = ia;
                    break;
                } else if (ia + 1 > lengthA) {
                    System.out.println("b" + ib + " after a" + ia);
                }
            }
        }
        

    }
    static void printArray(int[] arrayPrint){
        int arrayLength;
        arrayLength = arrayPrint.length;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayPrint[i] < 10) {
                System.out.print(" " + arrayPrint[i] + ", ");
            } else {
                System.out.print(arrayPrint[i] + ", ");
            }    
        }
        System.out.println("");
    }

 
}
