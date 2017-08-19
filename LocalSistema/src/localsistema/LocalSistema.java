/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localsistema;

import java.util.Locale;

/**
 *
 * @author Caio
 */
public class LocalSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale local = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(local.getLanguage());
    }
    
}
