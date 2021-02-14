/*
 * Задание: Составить программу нахождения произведения квадратов
 * первых двухсот чисел.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0304 {
    public static void main (String [] args){
        long result = 1;

        for (int i = 1; i <= 200; i++){
            result *= Math.pow(i, 2);
        }

        System.out.println(String.format("Произведение квадратов первых 200 чисел = %,d", result));
    }
}
