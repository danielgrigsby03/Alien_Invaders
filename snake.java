package snake;

import javafx.application.Application;
import javafx.scene.scene;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class snake extends Application 
{
private Stage stage;
private Scence scene; 

    public snake() 
    {
        this.stage = null;
        this.scene = null;
    } //  snake constructor

    public init() 
    {

    }// initialize 

    public void start(Stage start) 
    {
        this.stage = stage;
        this.stage.setMaxWidth(750);
        this.stage.setMaxHeight(750);
        this.scene = new Scene(this.root,575,600);
        this.stage.setOnCloseRequest(event -> Platform.exit());
        this.stage.setTitle("GalleryApp!");
        this.stage.setScene(this.scene);
        this.stage.sizeToScene();
        this.stage.show();
        Platform.runLater(() -> this.stage.setResizable(false));

    }// start
} // snake class