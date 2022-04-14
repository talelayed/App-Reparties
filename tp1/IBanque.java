import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IBanque extends Remote {

     public String Afficher() throws RemoteException;
}
