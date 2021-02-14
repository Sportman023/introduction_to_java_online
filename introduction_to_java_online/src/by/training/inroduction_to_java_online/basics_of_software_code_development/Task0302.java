/*
 * Задание: Вычислите значения функции на отрезке [a,b] с шагом h
 * y = x, x > 2 S -x, x <= 2.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0302 {
    public static void main (String [] args){
        int a = -10;
        int b = 10;
        int h = 3;
        
        for (int x = a; x <= b; x += h){
            if (x > 2){
                System.out.println("x = " + x + "; y = " + x);
            } else{
                System.out.println("x = " + x + "; y = " + -x);
            }
        }
    }
}
