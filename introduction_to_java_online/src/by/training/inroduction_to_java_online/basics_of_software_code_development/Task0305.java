/*
 * Задание: Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Обчщий член ряда имеет вид: 1/2^n + 1/3^n
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0305 {
   public static void main (String[] args){
        double e = 1e-9d;
        int n = 50;
        double result = 0d;
       
        for (int i = 0; i <= n; i++){
            double temp = 1/Math.pow(2, i) + 1/Math.pow(3, i);
           
            if(Math.abs(temp) >= e){
               result += temp;
            }
        }
        
        System.out.println("Result = " + result);
   }
}