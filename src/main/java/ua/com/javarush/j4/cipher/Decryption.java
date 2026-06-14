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


    public ArrayList<Character> shiftBack(ArrayList<Character> listIn, int key,
                                          ArrayList<Character> listOut) {

        for (int i = 0; i < listIn.size(); i++) {
            if  ((ALPHABET.get(ALPHABET.indexOf(listIn.get(i)) - key) < 0)) {
                int temp = ALPHABET.size() - (ALPHABET.get(ALPHABET.indexOf(listIn.get(i)) - key));
                listOut.add(ALPHABET.get(temp));
            }else {
                listOut.add(ALPHABET.get(ALPHABET.indexOf(listIn.get(i)) - key));
            }
        }
        return listOut;
    }
}

