package org.example.sem3.game;

public interface Game {
    // Должны быть описаны сигнатуры методов start, inputValue< getGameStatus
    void start(Integer sizeWord, Integer maxTry );
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
