import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueObject extends UnicastRemoteObject implements IBanque {
    public BanqueObject() throws RemoteException {};
    public String Afficher() throws RemoteException {
        Personne p1 =new Personne("Mohamed","Hsan",19);
        Personne p2 = new Personne("Malik","Ben Ammar",21);
        Personne p3 = new Personne("Molka","Ben Salih",20);

        Banque b = new Banque();
        b.creerCompte(p1,10000);
        b.creerCompte(p2,15000);
        b.creerCompte(p3,20000);

        String s="";

        for (Compte c:b.comptes) {
            s+=c.etatCompte()+"    ";
        }
        return s;}
    }


