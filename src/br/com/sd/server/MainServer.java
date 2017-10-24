package br.com.sd.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import br.com.sd.application.Calculator;

/**
 * @author Jefferson Coelho
 */
public class MainServer {

	public static void main(String[] args) {

		try {
			Registry registry = LocateRegistry.createRegistry(1090);
			registry.rebind("calculator", new Calculator());

			JOptionPane.showMessageDialog(null, "Servidor rodando");
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "(Erro no registro da aplicação) " + e.toString());
		}

	}

}
