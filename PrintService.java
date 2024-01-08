import java.rmi.*;
import java.rmi.RemoteException;

public interface PrintService extends Remote{
	public void print(String msg) throws RemoteException;
}
