/*
 * Copyright (C) 2021 Vadim
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package by.training.inroduction_to_java_online.basics_of_software_code_development;

/**
 * Задание: Дано натуральное число Т,
 * которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах
 * в следующей форме: ННч ММмин SSc.
 * 
 * @version
 * @author Vadim Ortman 
 */
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