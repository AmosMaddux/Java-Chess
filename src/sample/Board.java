package sample;

import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.ImageIcon;


public class Board
{
    public static LinkedList<Tile> tiles = new LinkedList<>();


    /*
    TODO: set the images so that they are visible
    TODO: write the legalmoves methods
    TODO: set up the taken pieces zones
    TODO: set up the save, load, and erase methods
     */


    static
    {
        int count = 1;
        while (count < 64)
        {
            for (int row = 0; row < 8; row++)
            {
                for (int column = 0; column < 8; column++)
                {
                    Tile tile = new Tile(row, column);
                    tiles.add(tile);
                    count++;
                }
            }
        }

        for (Tile tile : Board.getTiles())
        {
            if (tile.getRow() == 1)
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Pawn pawn = new Pawn("pawn", false, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(pawn);
                tile.setOccupied(true);
            }
            if (tile.getRow() == 6)
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Pawn pawn = new Pawn("pawn", true, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(pawn);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 0 && tile.getColumn() == 0) || (tile.getRow() == 0 && tile.getColumn() == 7))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Rook rook = new Rook("rook", false, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(rook);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 7 && tile.getColumn() == 0) || (tile.getRow() == 7 && tile.getColumn() == 7))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Rook rook = new Rook("rook", true, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(rook);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 0 && tile.getColumn() == 1) || (tile.getRow() == 0 && tile.getColumn() == 6))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Knight knight = new Knight("knight", false, tile,
                                           pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(knight);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 7 && tile.getColumn() == 1) || (tile.getRow() == 7 && tile.getColumn() == 6))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Knight knight = new Knight("knight", true, tile,
                                           pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(knight);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 4 && tile.getColumn() == 4) || (tile.getRow() == 0 && tile.getColumn() == 5))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Bishop bishop = new Bishop("bishop", false, tile,
                                           pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(bishop);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 7 && tile.getColumn() == 2) || (tile.getRow() == 7 && tile.getColumn() == 5))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Bishop bishop = new Bishop("bishop", true, tile,
                                           pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(bishop);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 0 && tile.getColumn() == 3))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Queen queen = new Queen("queen", false, tile,
                                        pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(queen);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 7 && tile.getColumn() == 3))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                Queen queen = new Queen("queen", true, tile,
                                        pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(queen);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 0 && tile.getColumn() == 4))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                King king = new King("king", false, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(king);
                tile.setOccupied(true);
            }

            if ((tile.getRow() == 7 && tile.getColumn() == 4))
            {
                ImageIcon pic = new ImageIcon("resources.pawn.png");
                King king = new King("king", true, tile,
                                     pic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
                tile.setOccupant(king);
                tile.setOccupied(true);
            }

        }
    }

    public static LinkedList<Tile> getTiles()
    {
        return tiles;
    }

    public static void setTiles(LinkedList<Tile> tiles)
    {
        Board.tiles = tiles;
    }

    public static Tile getTile(int row, int column)
    {
        int tileIndex = (row * 8 + column);
        Tile tile = tiles.get(tileIndex);
        return tile;

    }
}
