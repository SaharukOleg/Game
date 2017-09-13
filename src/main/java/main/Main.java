package main;

import logic.PlaygroundLabyrinth;

public class Main {
    public static void main(String[] args) {
        PlaygroundLabyrinth playgroundLabyrinth = new PlaygroundLabyrinth();
        PlaygroundLabyrinth labyrinth = playgroundLabyrinth.initPlayground();
        System.out.println(labyrinth);

    }
}
