/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.inroduction_to_java_online.basics_of_software_code_development;

/**
 *Задание: Дано действительное число R вида nnn.ddd. Поменять местами дробную и цедую части числа.
 * @author Vadim
 */
public class Task0104 {
        public static void main (String [] args){

    
    double r = 123.456;
    double r1 = Math.round(r%1*1000);
    double r2 = (r-(double)Math.round(r%1*1000)/1000)/1000;
    double r3 = r1+r2;
    System.out.println("r: " + r + "; r3 " + r3);
        }
}
