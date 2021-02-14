/*
 * Задание: Вычислить значение выражения по формуле (все переменные принимают 
 * действительные значения):
 * ((Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.sin(b))) * Math.tan(a * b)
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0103 {    
    public static void main (String [] args){
        double a = 6;
        double b = 7;
        double z = ((Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.sin(b)))
                * Math.tan(a * b);
        
        System.out.println("При a = " + a + ", b = " + b 
                + " значение функции z = " + z);
    }
}
