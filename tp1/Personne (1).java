public class Personne {
    public String nom;
    public String prenom;
    public int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public String Data() {
        return ("nom: "+nom+" prenom "+prenom+" age "+ age+" ans.");
    }
}
