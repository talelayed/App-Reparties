import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    private Client() {}
    public static void main(String[] args) throws MalformedURLException, RemoteException {
        String host = (args.length < 1) ? null : args[0];
        try {
            IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1099/BB");
            String response = stub.Afficher();
            System.out.println("response: " + response);
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
