package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    GridPane pane;





    @FXML
    public void onClick(MouseEvent click)
    {
        Button button = (Button) click.getSource();
        //System.out.println(click.getSource());
        int row = GridPane.getRowIndex(button);
        int column = GridPane.getColumnIndex(button);

        Tile tileClicked = searchForTile(row, column);
//        System.out.println("Button clicked! The button is in position (" + row + "," + column + ")");

        System.out.println(tileClicked.toString());
        GameHandler handler = new GameHandler();
        System.out.println("***************************");
        if (tileClicked.isOccupied())
        {
            System.out.println(tileClicked.getOccupant().toString());
            System.out.println(handler.printLegalMoves(tileClicked.getOccupant().generateLegalMoves()));
        }
        else
        {
            System.out.println("Tile is empty.");
        }

        /*for (Tile tile : tileClicked.getOccupant().generateLegalMoves())
        {
            System.out.println("The legal moves for " + tileClicked.getOccupant().getName() + "are : \n " + tile.toString());
        }*/
        /*for (Tile tile : Board.getTiles())
        {
            System.out.println(tile.toString());
        }*/
    }

    public Tile searchForTile(int row, int column)
    {
        for (Tile tile : Board.getTiles())
        {
            if (row == tile.getRow() && column == tile.getColumn())
            {
                return tile;
            }
        }
        return null;
    }
}
