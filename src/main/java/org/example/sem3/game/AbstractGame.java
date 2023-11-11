package org.example.sem3.game;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private Integer sizeWord;
    private  Integer maxTry;
    private GameStatus status;
    private String word;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.status = GameStatus.ACTIVE;
        this.word = generateWord(sizeWord);
        System.out.println(word);
    }
    private String generateWord(Integer sizeWord) {
        List<String> alf = generateCharList();
        // List<String> alf = generateEnCharList();
        String resultWord = "";
        for (int i = 0; i < sizeWord; i++) {
            Integer ind = new Random().nextInt(alf.size());
            resultWord += alf.get(ind);
            alf.remove(ind);
        }
        return resultWord;
    }

    protected abstract List<String> generateCharList();
    protected abstract List<String> generateEnCharList();
    protected abstract List<String> generateRuCharList();

    @Override
    public Answer inputValue(String value) {
        maxTry --;
        Integer countCow = 0;
        Integer countBull = 0;
        for (int i = 0; i < value.length(); i++) {
            Character ch = value.charAt(i);
            if (word.contains(ch.toString())) { // Проверяем содержится ли символ (коровы)
                countCow ++;
                if (ch.equals(word.charAt(i))) { // проверяем соответствует ли позиция (быки)
                    countBull ++;
                }
            }

        }
        if (countBull == word.length()) {
            status = GameStatus.WIN;
            return new Answer(maxTry, countCow, countBull);
        }
        if (maxTry == 0) {
            status = GameStatus.LOSE;
            return new Answer(maxTry, countCow, countBull);
        }
        return new Answer(maxTry, countCow, countBull);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }
    //
}
