import java.util.Scanner;

public class Exo8 {

    public static void main(String[] arg) {
        int n;
        int j =1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un nombre");

        n = sc.nextInt();

        for (int i =1; i<=n; i++) {

            j=j*i;
        }
        System.out.println("La factorielle de " +  n + " "+ "est" + " " + j);
    }
}
