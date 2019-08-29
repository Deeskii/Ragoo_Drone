package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***************************************************************
Author Name: Damarius Ragoo
Date: August 29, 2019
Program Name: Ragoo_Drone_Controller
Purpose: The purpose of this controller is to direct
the drone and collect its coordinates.
****************************************************************/


/**************************************************************
* This is the Ragoo_Drone_Main class that creates the stage and launches it.
* *************************************************************/
public class Ragoo_Drone_Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Ragoo_Drone_Layout.fxml"));
        primaryStage.setTitle("Ragoo Drone");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
