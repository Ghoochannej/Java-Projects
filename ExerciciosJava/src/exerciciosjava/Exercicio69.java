package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio69 {

	public static void Ex69() {
		
		int e, i, n, t=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		e = 1;
		
		for (i =1; i<=n;i++) {
			e = e*i;
			t = t+e;
			JOptionPane.showMessageDialog(null, "Fatorial: " + i + "\nResultado: "+ e);
		}
		
		JOptionPane.showMessageDialog(null, "Total Fatorial: " + t);
	}
}