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
 * Задание: Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3).
 * Определить, будут ли они расположены на одной прямой.
 * 
 * @version
 * @author Vadim Ortman 
 */
public class BranchingTask03 {
    public static void main (String [] args){
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        
        x1 = -2;
        y1 = 2;
        x2 = -6;
        y2 = 0;
        x3 = -2;
        y3 = 2;
        
        if(((y1 - y2) * (x1 - x3) - (y1 - y3) * (x1 - x2)) <= 1e-9){
            System.out.println("Yes");    
        } else {
            System.out.println("No");
        }
    }
}