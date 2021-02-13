/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.inroduction_to_java_online.basics_of_software_code_development;

/**
 *Задание: Для данной области составить программу, которая печатает true, если сточка с координатами (x, y) принадлежит закрашенной области
 * @author Vadim
 */
public class Task0106 {
    public static void main (String [] args){
        boolean [][] arr = new boolean [14][12];
        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 12; j++){
                arr [i][j] = false;
            }
        }
        
        for (int i = 2; i < 11; i++){
            for (int j = 1; j < 5; j++){
                arr [i][j] = true;
            }
        }
        
        for (int i = 4; i < 9; i++){
            for (int j = 4; j < 9; j++){
                arr [i][j] = true;
            }
        }
        arr[6][3] = false;
        
        int x = -3;
        int y = 2;
        
        if(arr[x+6][y+4]){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}
