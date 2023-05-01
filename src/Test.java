import java.util.Scanner;

public class Test {
    public static void main (String [] arg) {
        Scanner sc = new Scanner(System.in);
        int nombre;
        do {
            System.out.println("Entrer un nombre");
            nombre = sc.nextInt();
        } while (nombre >= 10 && nombre <= 20);

       if (nombre > 20) {
           System.out.println("Plus petit");
       }

       else if (nombre < 10) {
           System.out.println("Plus grand");
        }


}
}
