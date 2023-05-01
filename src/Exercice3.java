import java.util.Scanner;

public class Exercice3 {
    public static void main (String [] arg) {
        int a,b,c;
        System.out.println("Saisissez le nombre a :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = a * a;
        System.out.println("Le carré de" + " " + a + " " + "est " + " " + b);


    }
}
