/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.inroduction_to_java_online.basics_of_software_code_development;

/**
 *
 * @author Vadim
 */
public class Task0102 {
    public static void main (String [] args){
        double a = 6;
        double b = 7;
        double c = 12;
        
        double z = (b + Math.sqrt(b*b + 4*a*c))/(2*a)-Math.pow(a, 3)+Math.pow(b,-2);
        System.out.println("При a = " + a + ", b = " + b + " и c = " + c +" значение функции z = " + z);

    }
    
}
