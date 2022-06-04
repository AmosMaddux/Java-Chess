package sample;

public class Tile
{
    private int row;
    private int column;
    private boolean isOccupied;
    private boolean isThreatened;
    private Piece occupant;



    @Override
    public String toString()
    {
        return "Tile{" +
               "row=" + row +
               ", column=" + column +
               ", isOccupied=" + isOccupied +
               ", isThreatened=" + isThreatened +
               ", occupant=" + occupant +
               '}';
    }

    public Tile(int row, int column)
    {
        this.row = row;
        this.column = column;
        this.isOccupied = false;
        this.isThreatened = false;
        this.occupant = null;
    }

    public Tile()
    {

    }

    public int getRow()
    {
        return row;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public int getColumn()
    {
        return column;
    }

    public void setColumn(int column)
    {
        this.column = column;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(boolean occupied)
    {
        isOccupied = occupied;
    }

    public boolean isThreatened()
    {
        return isThreatened;
    }

    public void setThreatened(boolean threatened)
    {
        isThreatened = threatened;
    }

    public Piece getOccupant()
    {
        return occupant;
    }

    public void setOccupant(Piece occupant)
    {
        this.occupant = occupant;
    }
}
