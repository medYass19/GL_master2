import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FichierUtil {

    static SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

    public String lire(String chemin) {
        String contenu = "";
        try {
            FileReader fr = new FileReader(chemin);
            BufferedReader br = new BufferedReader(fr);
            String ligne = br.readLine();
            while (ligne != null) {
                contenu += ligne;
                ligne = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenu;
    }

    public void ecrire(String chemin, String texte) throws Exception {
        FileWriter fw = new FileWriter(chemin);
        fw.write(texte);
    }

    public String date() {
        return fmt.format(new Date());
    }

    public int lireEntier(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Throwable t) {
            return 0;
        } finally {
            return -1;
        }
    }

    public void attendre() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
