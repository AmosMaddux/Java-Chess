package sample;

import java.awt.Image;
import java.util.LinkedList;

public class King extends Piece
{

    @Override
    public LinkedList<Tile> generateLegalMoves()
    {
        LinkedList<Tile> legalMoves = new LinkedList<Tile>();

        Tile checkedTile = new Tile();
        int row = this.getPosition().getRow();
        int column = this.getPosition().getColumn();

        checkedTile = Board.getTile(row + 1, column);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row - 1, column);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row, column + 1);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row, column - 1);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row + 1, column + 1);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row + 1, column - 1);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row - 1, column + 1);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        checkedTile = Board.getTile(row - 1, column - 1);
        if (!checkedTile.isOccupied())
        {
            legalMoves.add(checkedTile);
        }
        else
        {
            if (checkedTile.getOccupant().isWhite() != this.isWhite())
            {
                legalMoves.add(checkedTile);
            }
        }
        return legalMoves;
    }

    public King(String name, boolean color, Tile position, Image image)
    {
        super(name, color, position, image);
    }
}
