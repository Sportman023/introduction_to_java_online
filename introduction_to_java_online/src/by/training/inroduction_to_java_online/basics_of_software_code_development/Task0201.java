/*
 * Задание: Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольный.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0201 {
    public static void main (String [] args){
        float angleA = 45f;
        float angleB = 90f;
        
        String outPut = " не существует";
        if ((angleA > 0) && (angleB > 0) && ((180 - angleA - angleB)>0)){
            outPut = " существует";
            if (angleA == 90f || angleB == 90f){
                outPut = outPut + " и он прямоугольный.";
            } else {
                outPut = outPut + " и он НЕ прямоугольный.";
            }
        }

        System.out.println("Треугольник с углами " + angleA + " и " + angleB + outPut);
    }
    
}
