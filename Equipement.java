package BalkisFresseClasse4;

public abstract class Equipement {

        public final int id;
        private String room;
        private boolean isOn;

        public Equipement(int id, String room) {
            this.id = id;
            this.room = room;
            this.isOn = false;
        }

        public int getId() {
            return id;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        public abstract void afficher();
    }



