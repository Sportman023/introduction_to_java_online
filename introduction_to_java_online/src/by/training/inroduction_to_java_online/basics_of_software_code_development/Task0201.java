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
 * Задание: Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольный.
 * 
 * @version
 * @author Vadim Ortman 
 */
public class Task0201 {
    public static void main (String [] args){
        float angleA = 45f;
        float angleB = 90f;
        String outPut = " не существует";
        
        if ((angleA > 0) && (angleB > 0) && ((180 - angleA - angleB)>0)){
            outPut = " существует";
            if (angleA == 90f || angleB == 90f){
                outPut = outPut + " и он прямоугольный.";
            } else {
                outPut = outPut + " и он НЕ прямоугольный.";
            }
        }

        System.out.println("Треугольник с углами " + angleA + " и " + angleB + outPut);
    }
    
}
