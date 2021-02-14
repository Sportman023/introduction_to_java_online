/*
 * Задание: Даны размары А, В прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0204 {
        public static void main (String [] args){
        int A = 2;
        int B = 8;
 
        int x = 7;
        int y = 16;
        int z = 3;
        
        int minAB = Math.min(A,B);
        int maxAB = Math.max(A, B);
        
        int minXYZ = Math.min(Math.min(x, y),Math.min(y, z));
        int midXYZ = (x + y + z)- minXYZ 
                - Math.max(Math.max(x, y),Math.max(y, z));
        
        System.out.println("minAB = " + minAB +  " minXYZ = " + minXYZ + "\n"
                + "maxAB = " + maxAB + " midXYZ = " + midXYZ);
        
        if (minAB >= minXYZ && maxAB >= midXYZ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}