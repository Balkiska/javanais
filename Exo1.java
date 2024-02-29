package BalkisFresse;

public class Exo1 {
    /* SUJET : Conversion d'unités d'angle */
    public static class AngleConverter {

        private double angleInDegrees;


        public AngleConverter(double angleInDegrees) {
            this.angleInDegrees = angleInDegrees;
        }

        public double convertTo(String targetUnit) {
            double result = 0.0;

            switch (targetUnit.toLowerCase()) {
                case "radian":
                    result = Math.toRadians(angleInDegrees);
                    break;
                case "grade":
                    result = angleInDegrees * (200.0 / 180.0);
                    break;
                default:
                    System.out.println("Unité non reconnue. Veuillez entrer 'radian' ou 'grade'.");
            }

            return result;
        }

        public void display() {
            double radian = convertTo("radian");
            double grade = convertTo("grade");

            System.out.printf("%.1f ° = %.10f radian = %.10f grade%n", angleInDegrees, radian, grade);
        }
    }
}
