package br.com.sd.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import br.com.sd.application.ICalculator;

/**
 * @author Jefferson Coelho
 */
public class MainClient {

	public static void main(String[] args) {

		try {
			ICalculator calculator = (ICalculator) Naming.lookup("rmi://localhost/calculator");

			String firstValue = JOptionPane.showInputDialog("Digite o primeiro valor:");
			String secondValue = JOptionPane.showInputDialog("Digite o segundo valor:");

			Object[] itens = { "Somar", "Subtrair", "Multiplicar", "Dividir" };
			Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um item", "Opçao",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

			if (selectedValue.equals("Somar")) {
				JOptionPane.showMessageDialog(null, "Resultado da soma = "
						+ calculator.sum(Integer.parseInt(firstValue), Integer.parseInt(secondValue)));
			} else if (selectedValue.equals("Subtrair")) {
				JOptionPane.showMessageDialog(null, "Resultado da subtração = "
						+ calculator.subtract(Integer.parseInt(firstValue), Integer.parseInt(secondValue)));
			} else if (selectedValue.equals("Multiplicar")) {
				JOptionPane.showMessageDialog(null, "Resultado da multiplicação = "
						+ calculator.multiply(Integer.parseInt(firstValue), Integer.parseInt(secondValue)));
			} else if (selectedValue.equals("Dividir")) {
				JOptionPane.showMessageDialog(null, "Resultado da soma = "
						+ calculator.sum(Integer.parseInt(firstValue), Integer.parseInt(secondValue)));
			} else {
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}

		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "(Erro no registro da aplica��o) " + e.toString());
		} catch (NotBoundException e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "(Erro no link da aplica��o) " + e.toString());
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "(Erro na opera��o da aplica��o) " + e.toString());
		}

	}

}
