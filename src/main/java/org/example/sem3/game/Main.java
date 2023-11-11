package org.example.sem3.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        NumberGame numberGame = new NumberGame();
        numberGame.start(4, 6);
        Scanner scanner = new Scanner(System.in);
        while (numberGame.getGameStatus().equals(GameStatus.ACTIVE)) {
            Answer answer = numberGame.inputValue(scanner.nextLine());
            System.out.println("answer = " + answer);
        }
        if (numberGame.getGameStatus().equals(GameStatus.WIN)) {
            System.out.println("Мы победили");
        } else {
            System.out.println("Вы проиграли");
        }
    }
}
