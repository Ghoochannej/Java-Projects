
package exerciciosjava;
import javax.swing.JOptionPane;

public class Exercicio54 {
    public static void Ex54(){
        String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo\n"
                                                       + "M - Masculino | F - Feminino");
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura "));
        double pesoIdeal = 0;
        
        if(sexo.equals("M")){
            pesoIdeal = (72.7*altura)-58;
        }else if(sexo.equals("F")){
            pesoIdeal = (62.1*altura)-44.7;
        }
        
        JOptionPane.showMessageDialog(null,"Seu peso ideal é " + pesoIdeal);
    }
}
