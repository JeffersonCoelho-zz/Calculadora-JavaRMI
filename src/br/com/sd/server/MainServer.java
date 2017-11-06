package br.com.sd.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.swing.JOptionPane;

import br.com.sd.application.Calculator;

/**
 * @author Jefferson Coelho
 */
public class MainServer {

	public static void main(String[] args) {

		try {
			LocateRegistry.createRegistry(1090);
			Naming.rebind("rmi://localhost/calculator", new Calculator());

			JOptionPane.showMessageDialog(null, "Servidor rodando");
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "(Erro no registro da aplica��o) " + e.toString());
		}

	}

}
