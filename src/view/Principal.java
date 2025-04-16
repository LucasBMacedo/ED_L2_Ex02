package view;

import javax.swing.JOptionPane;

import controller.RestoDaDivisao;

public class Principal {

	public static void main(String[] args) {
		RestoDaDivisao restDaDiv = new RestoDaDivisao();
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro para o dividendo"));
		int divisor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro para o divisor"));
		JOptionPane.showMessageDialog(null, "O resto da divisáo de " + dividendo + " por " + divisor + " é: " + restDaDiv.CalcularRestoDaDivisao(dividendo, divisor) + ".");
	}
}