public class Compte {
    Personne p ;
    double solde;

    public Compte(String nom,String prenom,int age,double solde) {
        this.solde = solde;
        this.p = new Personne(nom,prenom,age);
    }

    public Compte(Personne p, double solde) {
        this.p = p;
        this.solde = solde;
    }
    public String etatCompte() {
        return ("le solde du  compte de " +p.nom+" "+p.prenom+" est "+solde);
    }
    void ajouterSurCompte(int x) {
        solde += x;
    }
    void enleverSurCompte(int x) {
        solde -= x;
    }

    public double getValeurCompte() {
        return solde;
    }

    public void setValeurCompte(double solde) {
        this.solde = solde;
    }

    void transfertEntreCompte(int x, Compte compte) {
        compte.solde+=x;
        this.solde-=x;
    }

}
