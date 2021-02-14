/*
 * Задание: Найти max{min(a,b),min(a,b)}
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0202 {
    public static void main (String [] args){
        int a = 9;
        int b = 5;
        int c = 1;
        int d = 7;
        int result = Math.max(Math.min(a, b), Math.min(c, d));
        
        System.out.println("max{min(a,b),min(a,b)} = " + result);
    }
}
