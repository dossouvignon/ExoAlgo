import java.util.Scanner;

public class Exo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;
        System.out.println("Entrer un nombre");
        nombre = sc.nextInt();

        if (nombre >= 10 && nombre <= 20) {
            System.out.println("Réponse bonne");
        }
        else if (nombre > 20) {
            System.out.println("Plus petit");

        }

        else if (nombre < 10) {
            System.out.println("Plus grand");

            //Boucle for : for(initialisation, condition, incrémentation)

        }

        }

}
