/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.inroduction_to_java_online.basics_of_software_code_development;

/**
 *Задание: Найти max{min(a,b),min(a,b)}
 * @author Vadim
 */
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
