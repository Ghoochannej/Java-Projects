
package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio49 {
    public static void Ex49(){
        
       int idadeNadador =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do nadador " ));        
       String categoria = " ";    
       if(idadeNadador >= 5 && idadeNadador <= 10){
           categoria = "Infantil A";
       }else if(idadeNadador >= 11 && idadeNadador <= 13){
           categoria = "Juvenil A";
       }else if(idadeNadador >= 14 && idadeNadador <= 17){
           categoria = "Juvenil B";
       }else if(idadeNadador <= 4){
           categoria = "Jovem demais";
       }else{
           categoria = "Adulto";
       }
       
       JOptionPane.showMessageDialog(null, categoria);
    }
}
