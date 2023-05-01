import java.util.Scanner;

public class TestAlgo {

    public static void main (String arg []) {
        int nombre, produit;
        System.out.println("Entrer un nombre");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        produit = nombre * nombre;
        System.out.println("Le carré du nombre" + " " + nombre +" " + "est" + " " +  produit + ".");

    }

}