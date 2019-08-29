package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/***********************************************************
Author Name: Damarius Ragoo
Date: August 29, 2019
Program Name: Ragoo_Drone_Controller
Purpose: The purpose of this controller is to direct
           the drone and collect its coordinates.
*************************************************************/

/*****************************************************************
* This is the controller class that controls the Drones directions
* ****************************************************************/
public class Ragoo_Drone_Controller {

    public Label lblXcord;
    public Label lblYcord;
    public Label lblZcord;
    public Button btnUp;
    public Button btnDown;
    public Button btnForward;
    public Button btnBackward;
    public Button btnLeft;
    public Button btnRight;
    private int yClick ;
    private int xClick;
    private int zClick;


/********************************************************
* This method moves the drone up.
* ******************************************************/
    public void setBtnUp(ActionEvent actionEvent) {
        yClick++;
        lblYcord.setText(Integer.toString(yClick));
    }
    /********************************************************
     *This method moves the drone down.
     * ******************************************************/
    public void setBtnDown(ActionEvent actionEvent) {
        yClick--;
        lblYcord.setText(Integer.toString(yClick));
    }
    /********************************************************
     *This method moves the drone forward.
     * ******************************************************/
    public void setBtnForward(ActionEvent actionEvent) {
        zClick++;
        lblZcord.setText(Integer.toString(zClick));

    }
    /********************************************************
     *This method moves the drone backward.
     * ******************************************************/
    public void setBtnBackward(ActionEvent actionEvent) {
        zClick--;
        lblZcord.setText(Integer.toString(zClick));
    }
    /********************************************************
     *This method moves the drone left.
     * ******************************************************/
    public void setBtnLeft(ActionEvent actionEvent) {
        xClick--;
        lblXcord.setText(Integer.toString(xClick));
    }
    /********************************************************
     *This method moves the drone right.
     * ******************************************************/
    public void setBtnRight(ActionEvent actionEvent) {
        xClick++;
        lblXcord.setText(Integer.toString(xClick));
    }
}
