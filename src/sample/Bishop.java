package sample;

import java.awt.Image;
import java.util.LinkedList;

public class Bishop extends Piece
{
    @Override
    public LinkedList<Tile> generateLegalMoves()
    {
        LinkedList<Tile> legalMoves = new LinkedList<Tile>();

        int row = this.getPosition().getRow();
        int column = this.getPosition().getColumn();
        boolean rowPlusColumnPlus = true;
        boolean rowPlusColumnMinus = true;
        boolean rowMinusColumnPlus = true;
        boolean rowMinusColumnMinus = true;

        for (int adder = 1; adder <= 7; adder++)
        {
            while (rowPlusColumnPlus)
            {
                if (row + adder >= 0
                    && row + adder <= 7
                    && column + adder >= 0
                    && column + adder <= 7)
                {
                    Tile checkedTile = Board.getTile(row + adder, column + adder);
                    if (!checkedTile.isOccupied())
                    {
                        legalMoves.add(checkedTile);
                        break;
                    }
                    else
                    {
                        if (checkedTile.getOccupant().isWhite() != this.isWhite())
                        {
                            legalMoves.add(checkedTile);
                        }
                        rowPlusColumnPlus = false;
                    }
                }
                rowPlusColumnPlus = false;
            }

            while (rowPlusColumnMinus)
            {
                if (row + adder >= 0
                    && row + adder <= 7
                    && column - adder >= 0
                    && column - adder <= 7)
                {
                    Tile checkedTile = Board.getTile(row + adder, column - adder);
                    if (!checkedTile.isOccupied())
                    {
                        legalMoves.add(checkedTile);
                        break;
                    }
                    else
                    {
                        if (checkedTile.getOccupant().isWhite() != this.isWhite())
                        {
                            legalMoves.add(checkedTile);
                        }
                        rowPlusColumnMinus = false;
                    }
                }
                rowPlusColumnMinus = false;
            }

            while (rowMinusColumnPlus)
            {
                if (row - adder >= 0
                    && row - adder <= 7
                    && column + adder >= 0
                    && column + adder <= 7)
                {
                    Tile checkedTile = Board.getTile(row - adder, column + adder);
                    if (!checkedTile.isOccupied())
                    {
                        legalMoves.add(checkedTile);
                        break;
                    }
                    else
                    {
                        if (checkedTile.getOccupant().isWhite() != this.isWhite())
                        {
                            legalMoves.add(checkedTile);
                        }
                        rowMinusColumnPlus = false;
                    }
                }
                rowMinusColumnPlus = false;
            }

            while (rowMinusColumnMinus)
            {
                if (row - adder >= 0
                    && row - adder <= 7
                    && column - adder >= 0
                    && column - adder <= 7)
                {
                    Tile checkedTile = Board.getTile(row - adder, column - adder);
                    if (!checkedTile.isOccupied())
                    {
                        legalMoves.add(checkedTile);
                        break;
                    }
                    else
                    {
                        if (checkedTile.getOccupant().isWhite() != this.isWhite())
                        {
                            legalMoves.add(checkedTile);
                        }
                        rowMinusColumnMinus = false;
                    }
                }
                rowMinusColumnMinus = false;
            }
        }

        return legalMoves;
    }

    public Bishop(String name, boolean color, Tile position, Image image)
    {
        super(name, color, position, image);
    }
}
