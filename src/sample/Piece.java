package sample;

import java.awt.*;

import java.util.LinkedList;
import java.util.List;

public class Piece
{
    private String name;
    private boolean white;
    private Tile position;
    private Image image;
    private LinkedList<Tile> legalMoves;


    public LinkedList<Tile> generateLegalMoves()
    {

        return legalMoves;
    }

    public void move()
    {

    }

    public void Die()
    {

    }


    @Override
    public String toString()
    {
        String output = ("Name: " + name
                         + " isWhite: " + white);
        return output;
    }

    public Piece(String name, boolean color, Tile position, Image image)
    {
        this.name = name;
        this.white = color;
        this.position = position;
        this.image = image;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isWhite()
    {
        return white;
    }

    public void setWhite(boolean white)
    {
        this.white = white;
    }

    public Tile getPosition()
    {
        return position;
    }

    public void setPosition(Tile position)
    {
        this.position = position;
    }

    public List<Tile> getLegalMoves()
    {
        return legalMoves;
    }


}
