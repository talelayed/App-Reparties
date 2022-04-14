import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializerPER {
        public static void main(final String argv[]) {
            ObjectInputStream ois = null;
            try {
                final FileInputStream fichier = new FileInputStream("Person.ser");
                ois = new ObjectInputStream(fichier);
                final Personne personne = (Personne) ois.readObject();
                System.out.println("etudiant : ");
                System.out.println("nom : " + personne.getNom());
                System.out.println("prenom : " + personne.getPrenom());
                System.out.println("num compte : " + personne.getComptebanquaire().getNumero());
                System.out.println("num adresse :"+ personne.getComptebanquaire().getAdresse().getNum());
                System.out.println("adresse : " + personne.getComptebanquaire().getAdresse().getAdr());
            } catch (final java.io.IOException e) {
                e.printStackTrace();
            } catch (final ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

