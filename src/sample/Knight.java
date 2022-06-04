package sample;

import java.awt.Image;
import java.util.LinkedList;


public class Knight extends Piece
{
    @Override
    public LinkedList<Tile> generateLegalMoves()
    {
        LinkedList<Tile> legalMoves = new LinkedList<Tile>();
        int row = this.getPosition().getRow();
        int column = this.getPosition().getColumn();



        for (int rowAdder = -2; rowAdder <= 2; rowAdder++)
        {
            for (int columnAdder = -2; columnAdder <= 2; columnAdder++)
            {
                if (rowAdder != 0 && columnAdder != 0)
                {
                    if (!(rowAdder == columnAdder) && !(rowAdder + columnAdder == 0))
                    {
                        if (rowAdder + row >= 0 && rowAdder + row <= 7
                           && columnAdder + column >= 0 && columnAdder + column <= 7)
                        {
                            Tile checkedTile = Board.getTile(row + rowAdder, column + columnAdder);
                            if (checkedTile.isOccupied())
                            {
                                if (checkedTile.getOccupant().isWhite() != this.isWhite())
                                {
                                    legalMoves.add(checkedTile);
                                }
                            }
                            else
                            {
                                legalMoves.add(checkedTile);
                            }
                        }
                    }

                }
            }
        }

        return legalMoves;
    }
    
    public Knight(String name, boolean color, Tile position, Image image)
    {
        super(name, color, position, image);
    }
}
