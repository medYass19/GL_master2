//public class Compte {
//    public double solde;
//    public Compte(double solde){
//        this.solde=solde;
//    }
//    public void Retirer(double montant) {
//        if (solde - montant > 0) {
//            solde -= montant;
//        }
//    }
//
//    public void deposer(double montant) {
//        solde += montant;
//    }
//}
//
//
//void main() {
//    Compte compte=new Compte(200000.0);
//    System.out.println("the initial sold is "+ compte.solde);
//    compte.deposer(15000.0);
//    System.out.println("the  sold after disposer is "+ compte.solde);
//    compte.Retirer(10000.0);
//    System.out.println("the  sold after retirer is "+ compte.solde);
//
//
//}


//public class Compte {
//    public double solde;
//    public Compte(double solde){
//        this.solde=solde;
//    }
//    public void Retirer(double montant) {
//        if (solde - montant > 0) {
//            solde -= montant;
//        }
//        System.out.println(solde);
//    }
//
//    public void deposer(double montant) {
//        solde += montant;
//        System.out.println(solde);
//    }
//}
//
//
//void main() {
//    Compte compte=new Compte(20000.0);
//    System.out.println("the initial sold is "+ compte.solde);
//    compte.deposer(15000.0);
//    compte.Retirer(30000.0);
//
//
//}

public class Compte {
    public double solde;
    public Compte(double solde){
        this.solde=solde;
    }
    public void Retirer(double montant) {
        if (solde - montant > 0) {
            solde -= montant;
        }
        System.out.println(solde);
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println(solde);
    }
}


void main() {
    Compte compte=new Compte(20000.0);
    System.out.println("the initial sold is "+ compte.solde);
    compte.Retirer(0000.2);
    compte.deposer(10000.0);
//    compte.Retirer(500);
//    compte.deposer(500);

}