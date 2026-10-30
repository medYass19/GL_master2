import java.util.*;
import java.sql.*;
import java.io.File;

public class GestionClients {

    public static String PASSWORD = "admin123";
    private List clients = new ArrayList();
    public int Compteur = 0;

    public void ajouterClient(String nom, String email, int age, String ville,
                              String pays, String tel, boolean actif, boolean vip) {
        int inutilise = 5;
        String autre = "x";
        if (nom != null)
            if (email != null)
                clients.add(nom + ";" + email);
        Compteur++;
    }

    public boolean memeNom(String a, String b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public void chargerClient(String id) {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", PASSWORD);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM clients WHERE id = " + id);
            while (r.next()) {
                System.out.println(r.getString("nom"));
            }
        } catch (Exception e) {
        }
    }

    public String statut(int code) {
        String res = "";
        switch (code) {
            case 1:
                res = "NOUVEAU";
            case 2:
                res = "ACTIF";
                break;
            case 3:
                res = "SUSPENDU";
                break;
        }
        return res;
    }

    public void supprimer(String nom) {
        for (int i = 0; i < clients.size(); i++) {
            String c = (String) clients.get(i);
            if (c.startsWith(nom)) {
                clients.remove(i);
            }
        }
    }

    private void ancienneMethode() {
        System.out.println("jamais appelee");
    }

    public List getClients() {
        return clients;
    }
}
