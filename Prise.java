package BalkisFresseClasse4;

    // Classe prise héritante d'Equipement
    public class Prise extends Equipement {
        private boolean isActive; // Attribut supplémentaire

        public Prise(int id, String room) {
            super(id, room);  // Appel au constructeur de la classe parente Equipement
            this.isActive = true; // La prise est active par défaut
        }

        // Get pour l'attribut isActive
        public boolean isActive() {
            return isActive;
        }

        // Set pour l'attribut isActive
        public void setActive(boolean active) {
            isActive = active;
        }

        // Méthode
        @Override
        public void afficher() {
            System.out.println("Prise dans " + this.getRoom() + " (" + this.id + ") " + (this.isActive ? "active" : "inactive") + " : " + (this.isOn() ? "allumée" : "éteinte"));
        }
    }


