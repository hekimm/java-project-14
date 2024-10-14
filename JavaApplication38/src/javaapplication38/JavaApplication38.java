/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication38 {
public static boolean asalMi(int sayi){
    for(int i=2;i<sayi/2;i++){
        if(sayi %i ==0){
            return false;
        }
        
    }
   return true; 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    for(int i =0;i<1000;i++){
        if (asalMi(i)){
            System.out.println(i);
        }
    }
    }
    
}
