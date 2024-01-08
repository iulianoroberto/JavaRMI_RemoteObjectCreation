import java.rmi.*;
import java.rmi.RemoteException;

/*
 * Questa è la factory (fabbrica), ossia l'interfaccia a cui si fa riferimento per la creazione degli oggetti remoti.
 * Definisce il prototipo del metodo create() che  ritorno un oggetto di tipo PrintService.
 * Nel class diagram sarebbe l'equivalente di Factory.
 * Quindi, il client si rivolge alla factory per la creazione, run time, degli oggetti remoti.
 */

public interface PrintServiceFactory extends Remote{
	public PrintService create() throws RemoteException;
}
