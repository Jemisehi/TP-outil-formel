import org.junit.Test;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;

 public class Verif {
     public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
         Specification specification = new Specification();
         try{
         System.out.println("Entrez votre code");
         int code = clavier.nextInt();
         System.out.println("Entrez votre carte");
         int carte = clavier.nextInt();
         specification.accession(carte, code);
         specification.verification();}
         catch (Exception e){
             System.out.println("ACCES REFUSE!\n!!!ALARME DECLENCHE!!!");
         }
     }
}