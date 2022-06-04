package sample;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import sample.Tile;

public class GameHandler
{
    public GameHandler()
    {
    }

    public String printLegalMoves(LinkedList<Tile> legalMoves)
    {
        StringBuilder builder = new StringBuilder();
        /*builder.append("Name: " + this.getName());
        builder.append("\n Position: (" + this.getPosition().getRow() + "," + this.getPosition().getColumn() + ") ");
        builder.append("\n LegalMoves: ");*/
        int row;
        int column;
        for (Tile tile : legalMoves)
        {
            row = tile.getRow();
            column = tile.getColumn();
            builder.append("(" + row + "," + column + ")   ");
        }

        String output = builder.toString();
        return output;
    }

    public void startNewGame()
    {
        //erase data
        /*for (Tile tile : Board.getTiles())
        {
            if (tile.getRow() == 1)
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Pawn pawn = new Pawn("pawn", false, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(pawn);
                tile.setOccupied(true);
            }
        }*/
    }
}
