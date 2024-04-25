package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.utils.KeyboardController;

public class Main {

    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(30, 50);
        new KeyboardController(mapEditor);

    }
}
