/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_10_Arreglo_cubo {
    public static void main(String[]args){
        
        int[][][] cuboDatos= new int[3][4][5];
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k]=50;
                    System.out.print("["+cuboDatos[i][j][k]+"]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        
    }  
    
}
