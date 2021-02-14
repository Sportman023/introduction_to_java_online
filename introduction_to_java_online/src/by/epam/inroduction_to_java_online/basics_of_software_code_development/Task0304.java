/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.inroduction_to_java_online.basics_of_software_code_development;

/**
 * Задание: Составить программу нахождения произведения квадратов первых двухсот чисел.
 * @author Vadim
 */
public class Task0304 {
    public static void main (String [] args){
        long result = 1;
        for (int i = 1; i <= 200; i++){
            result *= Math.pow(i, 2);
        }
        System.out.println(String.format("Произведение квадратов первых 200 чисел = %,d", result));
    }
}
