package org.example.sem3.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    protected List<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    }

    @Override
    protected List<String> generateEnCharList() {
        return new ArrayList<>(Arrays.asList("a",
                "b", "c", "d", "e", "f", "g", "h", "j", "k",
                "l", "m", "n", "o", "p", "r", "s", "t", "u",
                "v", "x", "y", "z"));
    }

    @Override
    protected List<String> generateRuCharList() {
        return new ArrayList<>(Arrays.asList("а",
                "б", "в", "г", "д", "е", "ж", "з", "и", "к",
                "л", "м", "н", "о", "п", "р", "с", "е", "у",
                "ф", "х", "ц", "ч", "ш", "щ", "ь", "ъ",
                "э", "ю", "я"));
    }

}
