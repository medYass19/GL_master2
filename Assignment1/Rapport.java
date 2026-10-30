import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Rapport {

    private List<String> lignes = new ArrayList<String>();

    // Copie quasi identique de Calculs.calculerPrix (pour CPD)
    public double calculerPrixRapport(int type, double base, int qte, boolean vip, boolean promo, String pays) {
        double prix = base;
        if (type == 1) {
            if (qte > 10) {
                if (vip) {
                    prix = base * qte * 0.8;
                } else {
                    if (promo) {
                        prix = base * qte * 0.85;
                    } else {
                        prix = base * qte * 0.9;
                    }
                }
            } else {
                if (vip) {
                    prix = base * qte * 0.95;
                } else {
                    prix = base * qte;
                }
            }
        } else if (type == 2) {
            if (qte > 50) {
                prix = base * qte * 0.7;
            } else if (qte > 20) {
                prix = base * qte * 0.75;
            } else if (qte > 5) {
                prix = base * qte * 0.8;
            } else {
                prix = base * qte;
            }
        }
        return prix;
    }

    public void ajouter(String l) {
        lignes.add(l);
    }

    public String afficher(boolean debug) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lignes.size(); i++) {
            sb.append(lignes.get(i));
            sb.append("\n");
        }
        if (lignes.size() == 0) {
            return "";
        }
        return sb.toString();
    }

    public boolean estVide() {
        if (lignes.size() > 0) {
            return false;
        }
        return true;
    }
}
