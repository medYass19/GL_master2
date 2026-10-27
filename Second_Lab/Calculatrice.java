public class Calculatrice {
    public int division(int a, int b) {
        return a / b;
    }
    public int modulo(int a, int b) {
        return a % b;
    }
    public double moyenne(int[] valeurs) {
        if (valeurs == null) return 0;
        if (valeurs.length == 0) return 0;
        double somme = 0;
        for (int i = 0; i < valeurs.length; i++) {
            somme += valeurs[i];
        }
        return somme / valeurs.length;
    }
}

void main() {
    Calculatrice calculatrice=new Calculatrice();
    double div = calculatrice.division(10, 2);
    System.out.println(div);
   int mod= calculatrice.modulo(100,50);
    System.out.println(mod);
    int[] table= {20,30,40};
    double moy=calculatrice.moyenne(table);
    System.out.println(moy);

}