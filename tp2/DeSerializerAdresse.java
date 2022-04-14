import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializerAdresse {
    public static void main(final String argv[]) {

        ObjectInputStream ois = null;
    
        try {
          final FileInputStream fichier = new FileInputStream("Adresse.ser");
          ois = new ObjectInputStream(fichier);
          final Adresse adresse = (Adresse) ois.readObject();
          System.out.println("Adresse : ");
          System.out.println("nom : " + adresse.getVille());
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
