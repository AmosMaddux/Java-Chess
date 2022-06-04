package sample;


import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Pawn extends Piece
{

    private boolean hasMoved;

    @Override
    public LinkedList<Tile> generateLegalMoves()
    {
        LinkedList<Tile> legalMoves = new LinkedList<Tile>();
        int row = this.getPosition().getRow();
        int column = this.getPosition().getColumn();

        //check forward movement
        if (isWhite())
        {
            for (int i = 1; i <=2; i++)
            {
                Tile checkedTile = Board.getTile(row - i, column);
                if (!checkedTile.isOccupied())
                {
                    legalMoves.add(checkedTile);
                }
                else
                {
                    break;
                }
            }

            Tile checkedTile = Board.getTile(row -1, column -1);
            if (checkedTile.isOccupied())
            {
                if (!checkedTile.getOccupant().isWhite())
                {
                    legalMoves.add(checkedTile);
                }
            }

            checkedTile = Board.getTile(row -1, column +1);
            if (checkedTile.isOccupied())
            {
                if (!checkedTile.getOccupant().isWhite())
                {
                    legalMoves.add(checkedTile);
                }
            }
        }
        else
        {
            for (int i = 1; i <=2; i++)
            {
                Tile checkedTile = Board.getTile(row + i, column);
                if (!checkedTile.isOccupied())
                {
                    legalMoves.add(checkedTile);
                }
                else
                {
                    break;
                }
            }

            Tile checkedTile = Board.getTile(row +1, column -1);
            if (checkedTile.isOccupied())
            {
                if (checkedTile.getOccupant().isWhite())
                {
                    legalMoves.add(checkedTile);
                }
            }

            checkedTile = Board.getTile(row +1, column +1);
            if (checkedTile.isOccupied())
            {
                if (checkedTile.getOccupant().isWhite())
                {
                    legalMoves.add(checkedTile);
                }
            }

        }
        return legalMoves;
    }



    public Pawn(String name, boolean color, Tile position, Image image)
    {
        super(name, color, position, image);
        hasMoved = false;
    }

    public boolean isHasMoved()
    {
        return hasMoved;
    }
}
