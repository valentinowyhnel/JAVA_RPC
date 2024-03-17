import java.rmi.*;
import java.rmi.RemoteException;


public interface RMIInterface extends Remote {

    public void sendMessage(int a, int b) throws RemoteException;

    public String getMessage(String text) throws RemoteException; 

}
