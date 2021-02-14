/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.inroduction_to_java_online.basics_of_software_code_development;
import  java.util.Date;
/**
 *
 * @author Vadim
 */
public class Task0105 {
    public static void main (String [] args){
        int T = 9*3600 + 8*60 + 17;
        
        int h = Math.round(T/3600);
        int m = Math.round((T%3600)/60);
        int s = Math.round((T%3600)%60);
        
        System.out.println(addZero(h) + "ч " + addZero(m) + "м " + addZero(s) + "с");
        }
    
    public static String addZero(int t){
        String tS = t + "";
        if (t<10){
            tS = "0" + tS;
        }
    return tS;
    }
}