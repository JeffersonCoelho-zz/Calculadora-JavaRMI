package br.com.sd.application;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Jefferson Coelho
 */
public interface ICalculator extends Remote {

	public double sum(double a, double b) throws RemoteException;
	public double subtract(double a, double b) throws RemoteException;
	public double multiply(double a, double b) throws RemoteException;
	public double divide(double a, double b) throws RemoteException;

}
