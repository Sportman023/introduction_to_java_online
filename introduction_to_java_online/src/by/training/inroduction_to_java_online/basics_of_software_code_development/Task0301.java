/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

/**
 *Задание: Просумировать все числа от 1 до предложенного числа.
 * @author Vadim
 */
public class Task0301 {
    public static void main (String [] args){
        int toNumber = 100;
        long result = 0;
        
        for (int i = 1; i <= toNumber; i++){
            result += i;
        }
        System.out.println("Summ all numbers from 1 to " + toNumber + " is " + result);
    }
}
