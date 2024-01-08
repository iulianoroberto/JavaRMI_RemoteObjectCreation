import java.rmi.*;
import java.rmi.server.*;

/*
 * Questa classe implementa la Factory (l'interfaccia Factory) ed essendo una classe di oggetti remoti estende la classe
 * UnicastRemoteObject. Sarebbe la ConcreteFactory del class diagram.
 */


public class PrintServiceFactoryImpl extends UnicastRemoteObject implements PrintServiceFactory{
	
	private static final long serialVersionUID = 1L;
	public PrintServiceFactoryImpl() throws RemoteException {}

	// Viene implemnetato il metodo di creazione del Product che sarebbe un oggetto di tipo PrintService 
	public PrintService create() throws RemoteException {
		return new PrintServiceImpl();
	}
}
