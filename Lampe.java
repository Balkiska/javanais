package BalkisFresseClasse4;
// Classe Lampe héritante d'Equipement
public class Lampe extends Equipement {
    // emplacement lampe
    public Lampe(int id, String room) {
        super(id, room);
    }
    // Dit si lampe allumée ou éteinte
    @Override
    public void afficher() {
        System.out.println("Lampe dans " + getRoom() + " (" + getId() + ") : " + (isOn() ? "allumée" : "éteinte"));
    }
}