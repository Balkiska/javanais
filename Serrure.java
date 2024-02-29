package BalkisFresseClasse4;

public class Serrure {

    // Classe Serrure héritante d'Equipement
    public class serrure extends Equipement {
        private boolean isForDoor; // Attribut supplémentaire

        public serrure(int id, String room, boolean isForDoor) {
            super(id, room); // Appel au constructeur de la classe parente Equipement
            this.isForDoor = isForDoor; // Détermine si la serrure est pour une porte
        }

        // Getpour l'attribut isForDoor
        public boolean isForDoor() {
            return isForDoor;
        }

        // Set pour l'attribut isForDoor
        public void setForDoor(boolean forDoor) {
            isForDoor = forDoor;
        }

        // Méthode
        @Override
        public void afficher() {
            System.out.println("Serrure de " + (this.isForDoor ? "porte" : "fenêtre") + " dans " + this.getRoom() + " (" + this.id + ") : " + (this.isOn() ? "ouvert" : "fermé"));
        }

    }
}

