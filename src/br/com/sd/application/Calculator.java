package br.com.sd.application;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Jefferson Coelho
 */
public class Calculator extends UnicastRemoteObject implements ICalculator {

	private static final long serialVersionUID = 1L;

	public Calculator() throws RemoteException {
	}

	@Override
	public double sum(double a, double b) throws RemoteException {
		return a + b;
	}

	@Override
	public double subtract(double a, double b) throws RemoteException {
		return a - b;
	}

	@Override
	public double multiply(double a, double b) throws RemoteException {
		return a * b;
	}

	@Override
	public double divide(double a, double b) throws RemoteException {
		return a / b;
	}

}
