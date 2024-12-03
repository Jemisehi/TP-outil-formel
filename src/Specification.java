import java.util.Scanner;

public class Specification {

     boolean VerificationCarte;
     boolean VerificationCode;
     int tentatives =1;
     Scanner clavier = new Scanner(System.in);

    public boolean verification() { //Méthode pour la vérification des niveaux d'accès
        boolean AccesAccorde = false;
        if (VerificationCarte==true && VerificationCode==true) {
            AccesAccorde = true;
            System.out.println("Accès accordé");
        } else {
            AccesAccorde = false;
            System.out.println("Accès refusé");
        }
        AccesAccorde = false;
        return AccesAccorde;
    }

  public void accession(int carte, int code){ //Méthode pour vérifier la validité des cartes et le code
        do{
       if(carte>0 && code >0){
            System.out.println("Carte et code valides");
            VerificationCode = true;
            VerificationCarte = true;
           break;
        }else {
          System.out.println("Carte ou code invalide");
          VerificationCarte = false;
          VerificationCode = true;
          System.out.println("Entrez à nouveau la carte");
          carte=clavier.nextInt();
          System.out.println("Entrez à nouveau le code");
          code = clavier.nextInt();

        tentatives++;
            if(tentatives == 4){
                System.out.println("!!!!ALARME DECLENCHEE!!!!!!");
            }
        }

  }while (tentatives <4);
    }

}