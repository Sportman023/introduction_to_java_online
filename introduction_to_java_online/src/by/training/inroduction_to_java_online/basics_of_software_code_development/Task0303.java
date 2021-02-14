/*
 * Задание: Найти сумму квадратов первых ста чисел.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0303 {
    public static void main (String [] args){
        long result = 0;

        for (int i = 1; i <= 100; i++){
            result += Math.pow(i, 2);
        }

        System.out.println(String.format("Sum of sqr first 100 num is %,d", result));
    } 
}