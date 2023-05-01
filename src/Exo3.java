import java.util.Scanner;

public class Exo3{
    public static void main (String [] arg) {
        double priceHT;
        int nbreArticle;
        double tauxTVA;
        double prixTTC;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrer le prix HT");
        priceHT = clavier.nextDouble();

        System.out.println("Entrer le nombre d'article");
        nbreArticle = clavier.nextInt();

        tauxTVA = 0.18;
        System.out.println("Taux TVA = " + " "+ tauxTVA);

        prixTTC = ((priceHT*tauxTVA) + priceHT) * nbreArticle;

        System.out.println("le prix TTC est : " + " " + prixTTC);

    }
}

