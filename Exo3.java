package BalkisFresse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exo3 {

    public static class Anagram {

        String originalString;

        public Anagram(String originalString) {
            this.originalString = originalString;
        }

        public String desordre() {
            List<Character> characters = new ArrayList<>();

            for (char c : originalString.toCharArray()) {
                characters.add(c);
            }

            Collections.shuffle(characters, new Random());

            StringBuilder shuffledString = new StringBuilder();
            for (char c : characters) {
                shuffledString.append(c);
            }

            return shuffledString.toString();
        }
    }

}