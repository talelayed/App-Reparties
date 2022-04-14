public class Personne implements java.io.Serializable {
  private String nom    = "";
  private String prenom = "";
  private int    taille = 0;
  transient int valeur = 1234;
  private CompteBancaire compte ;


  public Personne(final String nom, final String prenom, final int taille,final String numCompte,final String ville){
    this.nom = nom;
    this.taille = taille;
    this.prenom = prenom;
    valeur ++;
    this.compte=new CompteBancaire(numCompte, ville);
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public int getTaille() {
    return this.taille;
  }

  public void setTaille(final int taille) {
    this.taille = taille;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(final String prenom) {
    this.prenom = prenom;
  }

  public String getNumCompte(){
    String x = this.compte.getNumCompte();
    return x;
  }

  public String getAdresse(){
    String x = this.compte.getAdresse();
    return x;
  }
}