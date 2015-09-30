/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_1;

import java.util.Random;

public class PRM2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = new int[5];
        int max = array[0];
        Random az=new Random();
        
        int suma = 0;
        int sumar = 0;
        
        for(int i=0; i<array.length; i++){
            
            array[i]=az.nextInt(1000);
            
        }
        
        
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                
            }
        }
        
        for (int i = 0; i < array.length; i++){
            suma+=array[i];
            
        }
        
        
        
        
        
        PRM2_1_RECU recu = new PRM2_1_RECU();
        
        recu.maxrecu(array,array.length);
        recu.sumaarray(array, 0);
        System.out.println(array);
        System.out.println(recu.sumaarray(array, 0));
        
    }
}
