package ua.com.javarush.j4.cipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decryption {
    private final List<Character> ALPHABET = Arrays.asList('а', 'б', 'в',
            'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' ');
    private final int ALPHABET_SIZE = ALPHABET.size();

    public  ArrayList<Character> shift(ArrayList<Character> list, int key) {
        ArrayList<Character> charListOut = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            charListOut.add(ALPHABET.get(ALPHABET.indexOf(list.get(i)) + key  % ALPHABET_SIZE));
        }
        return charListOut;
    }
}
