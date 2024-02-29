package BalkisFresse;

public class Launcher {
    public static void main(String[] args) {
        Exo1.AngleConverter angleConverter = new Exo1.AngleConverter(100.0);
        angleConverter.display();
    }

    {
        int[] testNumbers = {13, 27, 52};

        for (int number : testNumbers) {
            System.out.println("Suite itérative pour " + number + " :");
            Exo2.IterativeSequence sequence = new Exo2.IterativeSequence(number);
            sequence.calculateSequence();
            System.out.println();
        }
    }

    {
        Exo3.Anagram anagram = new Exo3.Anagram("voici un exemple");
        System.out.println("Chaîne originale : " + anagram.originalString);
        System.out.println("Chaîne mélangée : " + anagram.desordre());
    }
}