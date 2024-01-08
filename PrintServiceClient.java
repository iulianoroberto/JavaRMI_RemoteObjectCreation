import java.net.*;
import java.rmi.*;
import java.util.*;

/*
 * Qui si da vita al processo client.
 */

public class PrintServiceClient {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String s = null;
			// Il client recupera il riferimento globale (un oggetto che istanzia la classe proxy in RMI) all'oggetto printservicefactory (riferimento alla factory)
			PrintServiceFactory psf = (PrintServiceFactory)Naming.lookup("rmi://127.0.0.1/printservicefactory");
			// Invoca il metodo remoto per la creazione dell'oggetto remoto di tipo PrintService (creiamo dinamicamente l'oggetto remoto)
			// Si recupera il riferimento globale usando e invocandone il metodo print
			PrintService ps = psf.create();
			do {
				System.out.println("Inserisci un messaggio");
				s = sc.nextLine();
				ps.print(s);
			} while(!s.equals("."));
			ps.print("Exit");
		} catch (RemoteException e) {
			System.err.println("Remote invocation error " + e);
		} catch (MalformedURLException e) {
			System.err.println("Wrong URL for binding");
		} catch (NotBoundException e) {
			System.err.println("Object alreay bound to the registry");
		}
	}

}
