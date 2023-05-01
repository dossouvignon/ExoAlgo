import java.util.Scanner;
public class Exercice4 {
    public static void main (String arg []) {
        int a, b;
        System.out.println("Saisissez a et b: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a<0 & b<0) {
            System.out.println("Le produit de a et b est positif");
        }
        else if (a>0 & b>0) {
            System.out.println("Le produit de a et b est positif");
        }
        else  {
            System.out.println("Le produit de a et b est negatif");
        }
    }
}
