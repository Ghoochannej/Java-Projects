/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Caio
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        int p = 0;
        Arrays.sort(vet);
        for(int v:vet){
            System.out.print(v + " ");
        }
        p = Arrays.binarySearch(vet, 3);
        System.out.println("");
        System.out.println(p + " LAAAAAAAAAAAA");
    }
    
}
