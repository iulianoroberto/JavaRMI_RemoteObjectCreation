import java.rmi.*;
import java.rmi.server.*;

/*
 * Questa classe di oggetti remoti implementa l'interfaccia PrintService
 */

public class PrintServiceImpl extends UnicastRemoteObject implements PrintService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PrintServiceImpl() throws RemoteException {}
	public void print(String msg) {
		System.out.println(hashCode() + "::: " + msg);
	}
}