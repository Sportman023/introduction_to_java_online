/*
 * Задание: Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3).
 * Определить, будут ли они расположены на одной прямой.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0203 {
    public static void main (String [] args){
        double x1 = -2;
        double y1 = 2;
        double x2 = -6;
        double y2 = 0;
        double x3 = -2;
        double y3 = 2;
        
        if(((y1 - y2) * (x1 - x3) - (y1 - y3) * (x1 - x2)) <= 1e-9){
            System.out.println("Yes");    
        } else {
            System.out.println("No");
        }
    }
}