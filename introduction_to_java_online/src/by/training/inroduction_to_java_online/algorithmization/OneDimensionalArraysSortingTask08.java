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
 * Задание: Даны дроби p1/q1, p2/q2 ... pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему знаменателю
 * и упорядочивает их в порядке возрастания.
 * 
 * @author Vadim Ortman
 */
public class OneDimensionalArraysSortingTask08 {
    public static void main(String[] args) {
        int[] numeratorArr;
        int[] denominatorArr;
        int length;
        
        length = 10;
        numeratorArr = new int[length];
        denominatorArr = new int[length];
        
        for (int i = 0; i < length; i++) {
            numeratorArr[i] = (int)(Math.random() * 10) + 1;
            denominatorArr[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println("Original arrays:");
        printNumericArray(numeratorArr, denominatorArr);
        printStringArray(numeratorArr, denominatorArr);
        printNumericArray(denominatorArr, numeratorArr);
        System.out.println("");
        
        for (int i = 0; i < length - 1; i++) {
            if (i < 0) {
                i = 0;
            }
            if (denominatorArr[i] == denominatorArr[i + 1]) {
                
            } else if (denominatorArr[i] % denominatorArr[i + 1] == 0) {
                numeratorArr[i + 1] = numeratorArr[i + 1] * (denominatorArr[i] / denominatorArr[i + 1]);
                denominatorArr[i + 1] = denominatorArr[i];
                i = i - 2;
            } else if (denominatorArr[i + 1] % denominatorArr[i] == 0) {
                numeratorArr[i] = numeratorArr[i] * (denominatorArr[i + 1] / denominatorArr[i]);
                denominatorArr[i] = denominatorArr[i + 1];
                i = i - 2;
            } else {
                for (int j = 2; j * denominatorArr[i] <= denominatorArr[i] * denominatorArr[i + 1]; j++) {
                    if (denominatorArr[i] * j % denominatorArr[i + 1] == 0) {
                        numeratorArr[i] = numeratorArr[i] * j;
                        denominatorArr[i] = denominatorArr[i] * j;
                        
                        numeratorArr[i + 1] = numeratorArr[i + 1] * (denominatorArr[i] / denominatorArr[i + 1]);
                        denominatorArr[i + 1] = denominatorArr[i + 1] * (denominatorArr[i] / denominatorArr[i + 1]);
                        i = i - 2;
                        break;
                    }
                }
            }
        }
        System.out.println("Reduced to a common denominator arrays");
        printNumericArray(numeratorArr, denominatorArr);
        printStringArray(numeratorArr, denominatorArr);
        printNumericArray(denominatorArr, numeratorArr);
        System.out.println("\nSorted arrays");
        sortingArr(numeratorArr, denominatorArr);
    }
    
    static void printNumericArray(int[] arrayPrint1, int[] arrayPrint2){
        int arrayLength;
        arrayLength = arrayPrint1.length;

        for (int i = 0; i < arrayLength; i++) {
            int len1;
            int len2;
            len1 = 0;
            len2 = 0;
            for (int j = 1; arrayPrint1[i] % j < arrayPrint1[i]; j = j * 10) {
                len1++;
            }
            
            for (int j = 1; arrayPrint2[i] % j < arrayPrint2[i]; j = j * 10) {
                len2++;
            }
            
            for (int j = 0; j < len2 - len1; j++) {
                System.out.print(" ");
            }
            System.out.print(arrayPrint1[i] + " ");
        }
        System.out.println("");
    }
    static void printStringArray(int[] arrayPrint1, int[] arrayPrint2){
        int arrayLength;
        arrayLength = arrayPrint1.length;

        for (int i = 0; i < arrayLength; i++) {
            int len1;
            int len2;
            len1 = 0;
            len2 = 0;
            for (int j = 1; arrayPrint1[i] % j < arrayPrint1[i]; j = j * 10) {
                len1++;
            }
            
            for (int j = 1; arrayPrint2[i] % j < arrayPrint2[i]; j = j * 10) {
                len2++;
            }
            
            for (int j = 0; j < Math.max(len2,len1) - 1; j++) {
                System.out.print("-");
            }
            System.out.print("- ");
        }
        System.out.println("");
    }
    static void sortingArr(int[] numeratorArr,int[] denominatorArr) {
        int length;
        
        length = numeratorArr.length;
        
        for (int i = 0; i < length - 1; i++) {
            if (i < 0) {
                i = 0;
            }

            if (numeratorArr[i] > numeratorArr[i + 1]) {
                int temp;
                temp = numeratorArr[i];
                numeratorArr[i] = numeratorArr[i + 1];
                numeratorArr[i + 1] = temp;
                
                i = i - 2;
            }
        }
        printNumericArray(numeratorArr, denominatorArr);
        printStringArray(numeratorArr, denominatorArr);
        printNumericArray(denominatorArr, numeratorArr);
    }
}