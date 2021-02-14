/*
 * Задание: Вычислить значение функции:
 * F(x) = x^2 - 3x + 9 for x<=3, S 1/(x^3 + 6) for x >3
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0205 {
    public static void main (String [] args){
        double x = -1.0d;

        if (x <= 3){
            System.out.println((Math.pow(x, 2) - 3 * x + 9));
        }else{
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}