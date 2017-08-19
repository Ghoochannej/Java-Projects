/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int nasc;
        
        nasc = teclado.nextInt();
        
        int idade;
        
        idade = 2017 - nasc;
        
        if(idade>=18)
            System.out.println("Maior");
         else 
            System.out.println("Menor");
        
    }
    
}
