/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_1;

/**
 *
 * @author Artyom
 */
public class PRM2_1_RECU {

    public int maxrecu(int[] a, int index) {

        if (index > 0) {
            return Math.max(a[index], maxrecu(a, index - 1));//MARCA ERROR AQUI HELP!!!!
        } else {
            return a[0];
        }

    }

    public int sumaarray(int[] a, int n) {

        n = a.length;

        if (n == 0) {
            return a[n];
        } else {
            return a[n] + sumaarray(a, n - 1);
        }

    }

}
