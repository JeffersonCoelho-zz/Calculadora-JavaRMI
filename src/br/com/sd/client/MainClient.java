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
			ICalculator calculator = (ICalculator) Naming.lookup("rmi://localhost:1090/calculator");

			JOptionPane.showMessageDialog(null,"Teste, somando 5 + 5 = " + calculator.sum(5, 5));

		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "(Erro no registro da aplicação) " + e.toString());
		} catch (NotBoundException e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "(Erro no link da aplicação) " + e.toString());
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "(Erro na operação da aplicação) " + e.toString());
		}

	}

}
