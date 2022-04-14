public class Compte implements java.io.Serializable {
     private Adresse adresse;
     private int numero;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Compte(Adresse adresse1, int num ) {
        this.adresse = adresse1;
        this.numero =num;
    }


}
