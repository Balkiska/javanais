package BalkisFresse;

public class Exo2 {
        public static class IterativeSequence {

            private int initialNumber;


            public IterativeSequence(int initialNumber) {
                this.initialNumber = initialNumber;
            }

            public void calculateSequence() {
                int currentNumber = initialNumber;
                System.out.print(currentNumber);

                while (currentNumber != 1) {
                    if (currentNumber % 2 == 0) {
                        currentNumber = currentNumber / 2;
                    } else {
                        currentNumber = 3 * currentNumber + 1;
                    }
                    System.out.print(" → " + currentNumber);
                }
                System.out.println();
            }
        }
}
