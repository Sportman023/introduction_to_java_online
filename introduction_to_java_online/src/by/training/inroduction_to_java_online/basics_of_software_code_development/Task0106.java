/*
 * Задание: Для данной области составить программу, которая печатает
 * true, если сточка с координатами (x, y) принадлежит закрашенной области,
 * и false — в противном случае
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0106 {
    public static void main (String [] args){
        double x = 4;
        double y = -0.1;
        boolean result = false;
        
        if(((x >= -4 && x < -2) && (y >= -3 && y < 0))
                || ((x >= -2 && x < 2) && (y >= -3 && y < 4))
                || ((x >= 2 && x < 4) && (y >= -3 && y < 0))){
           result = true; 
        }
        
        System.out.println(result);
    }
}