package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

import static org.academiadecodigo.bootcamp.Grid.CELL_SIZE;
import static org.academiadecodigo.bootcamp.MapEditor.COLORS;
import static org.academiadecodigo.bootcamp.MapEditor.colorIndex;

public class Cursor extends Cell {


    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }


    public Cursor() {
        super(0, 0);
        rectangle.setColor(Color.BLACK);
        paint();
    }

    public void moveUp() {
        row--;
        rectangle.translate(0, -CELL_SIZE);
    }

    public void moveDown() {
        row++;
        rectangle.translate(0, CELL_SIZE);
    }

    public void moveLeft() {
        col--;
        rectangle.translate(-CELL_SIZE, 0);

    }

    public void moveRight() {
        col++;
        rectangle.translate(CELL_SIZE, 0);
    }
    public void changeColor() {
        colorIndex = (colorIndex + 1) % COLORS.length;
        rectangle.setColor(COLORS[colorIndex]);
    }
}
