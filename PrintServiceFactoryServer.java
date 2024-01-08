import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;

/*
 * Qui si da vita al processo Server.
 */

public class PrintServiceFactoryServer {

	public static void main(String[] args) {
		try {
			// Viene creato un oggetto concreto di tipo PrintServiceFactoryImpl (sarebbe il punto di accesso del client per la creazione degli oggetti remoti)
			PrintServiceFactory psf = new PrintServiceFactoryImpl();
			// Si avvia il registro che è ospitato dal processo server
			LocateRegistry.createRegistry(1099);
			// L'oggetto viene caricato nel registro con il nome di printservicefactory
			Naming.bind("rmi://127.0.0.1/printservicefactory", psf);
		} catch(AccessException e) {
			System.err.println("Bind operation not permitted");
		} catch (RemoteException e) {
			System.err.println("Registry could not be contacted");
		} catch (MalformedURLException e) {
			System.err.println("Wrong URL for binding");
		} catch (AlreadyBoundException e) {
			System.err.println("Object alreay bound to the registry");
		}
	}

}
