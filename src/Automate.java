public class Automate {
public enum Etat{
    Verification,Acces_Accorde , Acces_Refuser,Alarme;

}

 Etat etatcurant;
 Specification specification;

    public Automate( Specification specification) {
        this.etatcurant = Etat.Verification;
        this.specification = specification;
    }

    public Etat getEtatcurant(){
    return etatcurant;
}


}
