import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;


public class SerializerPER {
        public static void main(final String argv[]) {
            final Personne personne = new Personne ("Dupond", "Jean",
                    new Compte(new Adresse(9999,"monastir"),8888) );
            ObjectOutputStream oos = null;

            try {
                final FileOutputStream fichier = new FileOutputStream("Personne.ser");
                oos = new ObjectOutputStream(fichier);
                oos.writeObject(personne);
                oos.flush();
            }
            catch (final java.io.IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (oos != null) {
                        oos.flush();
                        oos.close();
                    }
                } catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

