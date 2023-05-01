import java.util.Scanner;

public class Exo5 {
    public static void main(String[] arg){
       int age;
       Scanner sc = new Scanner(System.in);
       System.out.println("Entrer votre age :");
       age = sc.nextInt();
       if (age >= 6 & age<=7){
           System.out.println("Catéforie Poussin");
       }

       else if (age >= 8 & age<=9 ){
           System.out.println("Catéforie Pupille");
       }

       else if (age >= 10 & age<=11 ){
           System.out.println("Catéforie Minime");
       }

       else if (age >= 12 ){
           System.out.println("Catéforie Cadet");
       }

    }
}
