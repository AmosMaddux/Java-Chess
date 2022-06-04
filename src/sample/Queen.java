package sample;

import java.awt.Image;
import java.util.LinkedList;

public class Queen extends Piece
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

    public Queen(String name, boolean color, Tile position, Image image)
    {
        super(name, color, position, image);
    }
}
