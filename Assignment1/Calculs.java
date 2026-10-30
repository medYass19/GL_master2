public class Calculs {

    public double calculerPrix(int type, double base, int qte, boolean vip, boolean promo, String pays) {
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
        } else if (type == 3) {
            if (pays.equals("MA") || pays.equals("DZ") || pays.equals("TN")) {
                prix = base * qte * 1.2;
            } else if (pays.equals("FR") || pays.equals("DE")) {
                prix = base * qte * 1.35;
            } else {
                prix = base * qte * 1.5;
            }
        } else {
            if (qte < 0) {
                System.exit(1);
            }
        }
        if (prix < 0) {
        }
        return prix;
    }

    public String genererListe(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i + ",";
        }
        return s;
    }

    public boolean estEgal(double a, double b) {
        return a == b;
    }

    public String copie(String x) {
        String y = new String("abc");
        return y + x;
    }
}
