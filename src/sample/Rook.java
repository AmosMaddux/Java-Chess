package sample;

import java.awt.Image;
import java.util.LinkedList;

public class Rook extends Piece
{

    @Override
    public LinkedList<Tile> generateLegalMoves()
    {
        LinkedList<Tile> legalMoves = new LinkedList<Tile>();

        int row = this.getPosition().getRow();
        int column = this.getPosition().getColumn();

        for (int columnAdder = 1; columnAdder <= 7; columnAdder++)
        {
            if (column + columnAdder >= 0 && column + columnAdder <= 7)
            {
                Tile checkedTile = Board.getTile(row, column + columnAdder);
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
                    break;
                }
            }



        }
        
        for (int columnAdder = -1; columnAdder >= -7; columnAdder--)
        {
            if (column + columnAdder >= 0 && column + columnAdder <= 7)
            {
                Tile checkedTile = Board.getTile(row, column + columnAdder);
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
                    break;
                }
            }
        }

        for (int rowAdder = 1; rowAdder <= 7; rowAdder++)
        {
            if (row + rowAdder >= 0 && row + rowAdder <= 7)
            {
                Tile checkedTile = Board.getTile(row + rowAdder, column);
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
                    break;
                }
            }
        }

        for (int rowAdder = -1; rowAdder >= -7; rowAdder--)
        {
            if (row + rowAdder >= 0 && row + rowAdder <= 7)
            {
                Tile checkedTile = Board.getTile(row + rowAdder, column);
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
                    break;
                }
            }
        }
        
        return legalMoves;
    }

    public Rook(String name, boolean color, Tile position, Image image)
    {
        super(name, color, position, image);
    }
}
