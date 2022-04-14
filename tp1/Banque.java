import java.util.Vector;

public class Banque {
    public Vector<Compte> comptes=new Vector<>() ;
    public void creerCompte(Personne p, double solde) {
        comptes.addElement(new Compte(p,solde));
    }
}
