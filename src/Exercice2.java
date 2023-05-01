import java.util.Scanner;

public class Exercice2 {
    /**
     * Utilisation de la méthode main.
     * @param arg
     */
    public static void main(String arg[]) {

        int valeurUne, valeurDeux, valeurTemporaire;
        System.out.println("Entrez les valeurs a, b");
        Scanner sc = new Scanner(System.in);
        valeurUne = sc.nextInt();
        valeurDeux = sc.nextInt();
        valeurTemporaire = valeurUne;
        valeurUne = valeurDeux;
        valeurDeux = valeurTemporaire;

        System.out.println("La valeur de a est" + " " + valeurUne);
        System.out.println("La valeur de b est" + " " + valeurDeux);
    }
}
