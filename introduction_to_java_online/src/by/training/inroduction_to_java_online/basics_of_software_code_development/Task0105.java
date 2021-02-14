/*
 * Задание: Дано натуральное число Т,
 * которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах
 * в следующей форме: ННч ММмин SSc.
 */
package by.training.inroduction_to_java_online.basics_of_software_code_development;

public class Task0105 {
    public static void main (String [] args){
        int T = 9*3600 + 8*60 + 17;        
        int h = Math.round(T/3600);
        int m = Math.round((T%3600)/60);
        int s = Math.round((T%3600)%60);
        
        System.out.println(addZero(h) + "ч " + addZero(m) + "м " 
                + addZero(s) + "с");
        }
    
    public static String addZero(int t){
        String tS = t + "";
        if (t < 10){
            tS = "0" + tS;
        }
    return tS;
    }
}