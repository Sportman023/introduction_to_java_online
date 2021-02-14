/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

/**
 *Задание: Вычислить значение функции: F(x) = x^2 - 3x + 9 for x<=3, S 1/(x^3 + 6) for x >3
 * @author Vadim
 */
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