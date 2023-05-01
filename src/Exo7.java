import java.util.Scanner;

public class Exo7 {
    public static void main(String[] arg) {
        int n;
        int j =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un nombre");

        n = sc.nextInt();

     for (int i =1; i<=n; i++) {

         j=j+i;
     }
     System.out.println("La somme de " +  n + " "+ "est" + " " + j);
   }

}
