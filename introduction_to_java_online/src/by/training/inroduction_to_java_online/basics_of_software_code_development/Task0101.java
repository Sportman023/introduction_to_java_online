/*
 * Задание: найдите значение функции: z = ((a-3)*b/2)+c
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0101 {
    public static void main (String [] args){
        double a = 6;
        double b = 7;
        double c = 12;        
        double z = ((a - 3) * b / 2.0) + c;
        
        System.out.println("При a = " + a + ", b = " + b + " и c = " + c 
                +" значение функции z = " + z);
    }
}
