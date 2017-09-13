
package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio36 {
    public static void Ex36(){
        double operacao = 0;
        double consumo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o consumo em KW/h de sua conta de luz "));
        String tipoDeCliente = JOptionPane.showInputDialog(null, "Você faz parte de que tipo de cliente? \n"
                                                                        + "Residência, Comércio ou Indústria");
        
        if(tipoDeCliente.equals("Residência")){
            operacao = 0.6;
        }else if(tipoDeCliente.equals("Comércio")){
            operacao = 0.48;
        }else if(tipoDeCliente.equals("Indústria")){
            operacao = 1.29;
        }
        
        double resultado = operacao * consumo;
        
        JOptionPane.showMessageDialog(null, "O valor de sua conta de luz é: " + resultado);
        
    }
}