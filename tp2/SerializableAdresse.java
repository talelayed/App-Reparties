import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializableAdresse {
    public static void main(String[] args) {
        final Adresse adresse = new Adresse("Tunis");
        ObjectOutputStream oos = null;

        try {
            final FileOutputStream fichier = new FileOutputStream("Adresse.ser");
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(adresse);
            oos.flush();
          } catch (final java.io.IOException e) {
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
